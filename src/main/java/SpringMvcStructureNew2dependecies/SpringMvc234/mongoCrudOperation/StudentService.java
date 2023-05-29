package SpringMvcStructureNew2dependecies.SpringMvc234.mongoCrudOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    StudentRepo studentRepo;

    @Autowired
    private RestTemplate restTemplate;
    public String addStudent(StudentClass student){
        studentRepo.save(student);
        return "Added SuccessFully";
    }
    public String updateStudent(int id,StudentClass sts){
       StudentClass s= studentRepo.findById(id).get();

        s.setCity(sts.getCity());
        s.setName(sts.getName());
        studentRepo.save(s);
        return "Update SuccessFully";
    }

    public List<StudentClass> getAllData(){
        return studentRepo.findAll();

    }
    public String deleteStudent(int id){
        studentRepo.deleteById(id);
        return "Delete SuccessFully";
    }




    //Rest-Template By -usimg thid-API-//
    public String addStudentRestTemplate(StudentClass student){

//
//        String url = "http://localhost:8080/studentMongo";  // Replace with the actual base URL of your REST API
//        HttpEntity<StudentClass> requestEntity = new HttpEntity<>(student);
//        try {
//            restTemplate.postForObject(url, requestEntity, StudentClass.class);
//            return "Added Successfully By Rest Template";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "Failed to add student";
//        }

//        String url = "http://localhost:8080/studentMongo";  // Replace with the actual base URL of your REST API
//        HttpEntity<StudentClass> requestEntity = new HttpEntity<>(student);
//        StudentClass response = restTemplate.postForObject(url, requestEntity, StudentClass.class);
//        if (response != null) {
//            // Handle the successful response here
//            return "Added Successfully By Rest Template";
//        } else {
//            // Handle the unsuccessful response or error condition here
//            return "Failed to add student";
//        }

//        String url = "http://localhost:8080/studentMongo";  // Replace with the actual base URL of your REST API
//        HttpEntity<StudentClass> requestEntity = new HttpEntity<>(student);
//        restTemplate.postForObject(url, requestEntity, StudentClass.class);
//        return "Added Successfully By Rest Template";

        String url = "http://localhost:8080/studentMongo";  // Replace with the actual base URL of your REST API
        HttpEntity<StudentClass> requestEntity = new HttpEntity<>(student);
        restTemplate.postForObject(url, requestEntity, Void.class);
        return "Added Successfully By Rest Template";

//        public String createProducts(@RequestBody Product product) {
//            HttpHeaders headers = new HttpHeaders();
//            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//            HttpEntity<Product> entity = new HttpEntity<Product>(product,headers);
//
//            return restTemplate.exchange(
//                    "http://localhost:8080/products", HttpMethod.POST, entity, String.class).getBody();
//        }

    }
    public String updateStudentRestTemplate(int id,StudentClass sts){

        String url = "http://localhost:8080/updateStudent/{id}";  // Replace with the actual base URL of your REST API

            String endpointUrl = url.replace("{id}", String.valueOf(id));
            HttpEntity<StudentClass> requestEntity = new HttpEntity<>(sts);
            restTemplate.put(endpointUrl, requestEntity);
            return "Update Successfully by RestTemplate";


    }

    public List<StudentClass> getAllDataRestTemplate(){

        String url = "http://localhost:8080/getAllDataFromMomgo";  // Replace with the actual base URL of your REST API
        ResponseEntity<List<StudentClass>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<StudentClass>>() {}
        );
        return response.getBody();

    }
    public String deleteStudentRestTemplate(int id){



            String url = "http://localhost:8080/deteletDataFromMongoDbB/{id}";  // Replace with the actual base URL of your REST API
            restTemplate.delete(url, id);
            return "Delete Successfully by Rest template";

    }

}
