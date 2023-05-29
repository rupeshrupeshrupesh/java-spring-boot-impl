package SpringMvcStructureNew2dependecies.SpringMvc234.newPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RestControllerr {


    @Autowired
    private ServiceMain sman;

    @PostMapping("/student")
    public PojoStudent CreateAndAddStudent(@RequestBody PojoStudent sts){

       return sman.AddStudentAndCreate(sts);
//       return sts;
    };

    @PutMapping("/updateStudent")
    public PojoStudent UpdateStudent(@PathVariable PojoStudent sts)
    {

        return sman.UpdateAndAddStudent(sts);
    }

    @DeleteMapping("deleteMapping/{id}")
    public String deleteStudent(@PathVariable int id)
    {
        return sman.deleteStudent(id);
    }

    @GetMapping("getAllData")
    public List<PojoStudent> getAllData(){
        return sman.getAllData();
    }
}


