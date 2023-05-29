package SpringMvcStructureNew2dependecies.SpringMvc234.mongoCrudOperation;

import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sendgrid.SendGrid;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {


    @Autowired
    StudentService studentService;


    @PostMapping("/studentMongo")
    public String addStudent(@RequestBody StudentClass student) {
        return studentService.addStudent(student);

    }

    @PutMapping("/updateStudent/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody StudentClass sts) {
        return studentService.updateStudent(id, sts);

    }

    @GetMapping("/getAllDataFromMomgo")
    public List<StudentClass> getAllData() {
        return studentService.getAllData();

    }

    @DeleteMapping("/deteletDataFromMongoDbB/{id}")
    public String deleteDataFromMongoDB(@PathVariable int id) {

        return studentService.deleteStudent(id);
    }

    //Rest-Tempolate-ByUnsing-URL


    @PostMapping("/studentMongoRestTemplate")
    public String addStudentRestTemplate(@RequestBody StudentClass student) {
        return studentService.addStudentRestTemplate(student);

    }

    @PutMapping("/updateStudentRestTemplate/{id}")
    public String updateStudentRestTemplate(@PathVariable int id, @RequestBody StudentClass sts) {
        return studentService.updateStudentRestTemplate(id, sts);

    }

    @GetMapping("/getAllDataFromMomgoRestTemplate")
    public List<StudentClass> getAllDataRestTemplate() {
        return studentService.getAllDataRestTemplate();

    }

    @DeleteMapping("/deteletDataFromMongoDbBRestTemplate/{id}")
    public String deleteDataFromMongoDBRestTemplate(@PathVariable int id) {

        return studentService.deleteStudentRestTemplate(id);
    }

    ///by using sending mail
    @Autowired


     SendGrid sendGrid;


    // Method to send an email
    @PostMapping("/SendEmail/{to}/{subject}/{text}")
    public void sendEmail(@PathVariable String to, @PathVariable String subject, @PathVariable String text) {
        Email from = new Email("rupesh.dafare@thinkitive.com");
        Email toEmail = new Email(to);
        Content content = new Content("text/plain", text);
        Mail mail = new Mail(from, subject, toEmail, content);

        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());

            Response response = sendGrid.api(request);

            System.out.println("Email sent successfully. Status code: " + response.getStatusCode());
        } catch (Exception e) {
            System.err.println("An error occurred while sending the email: " + e.getMessage());
        }
    }




}
