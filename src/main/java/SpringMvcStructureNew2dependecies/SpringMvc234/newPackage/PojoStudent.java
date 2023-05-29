package SpringMvcStructureNew2dependecies.SpringMvc234.newPackage;


import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class PojoStudent {


   @Id
   private int id;
   private String name;
   private  int roll_Number;


}
