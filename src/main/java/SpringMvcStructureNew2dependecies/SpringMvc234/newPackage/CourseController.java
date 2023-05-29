package SpringMvcStructureNew2dependecies.SpringMvc234.newPackage;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;



@RestController
public class CourseController{

    //coursees
    //course id,name,author


    @RequestMapping(  value = "/courses",method = RequestMethod.GET)
    public List<Course> retriveAllCourse(){
        return Arrays.asList(

                new Course(111L,"LearnAWS","in28Minutes"),
                new Course(11L,"LearnDayOff","in30Minutes")
        );
    }
}
