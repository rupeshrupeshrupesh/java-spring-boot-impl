package SpringMvcStructureNew2dependecies.SpringMvc234.newPackage;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AdviceContoller {

    @ExceptionHandler(value=CustomException.class)
    public ResponseEntity<Object> exception(Exception e){

        return new ResponseEntity<Object> ("Exception Found", HttpStatus.NOT_FOUND);
    }
}
