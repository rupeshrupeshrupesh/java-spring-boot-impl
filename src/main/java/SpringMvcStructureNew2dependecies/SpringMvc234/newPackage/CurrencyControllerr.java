package SpringMvcStructureNew2dependecies.SpringMvc234.newPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
public class CurrencyControllerr {

    @Autowired
    private CurrencyserviceConfiguration c;

    @RequestMapping(value = "/currency", method = RequestMethod.GET)
    public CurrencyserviceConfiguration retriveAllCourse() {
        return c;
    }
}


