package SpringMvcStructureNew2dependecies.SpringMvc234.newPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@Controller
@RestController
public class MvcController {


    @RequestMapping("/index")
//    @ResponseBody
    public String display()
    {
        return "index";
    }

    @RequestMapping("/madhuri")
    public String display1(){

        return "madhuri";
    }

    @RequestMapping("/prasad")
    public String display12(){

        return "prasad";
    }
}
