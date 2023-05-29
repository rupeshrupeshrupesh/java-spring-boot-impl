package SpringMvcStructureNew2dependecies.SpringMvc234.mongoCrudOperation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data @AllArgsConstructor@NoArgsConstructor
public class StudentClass {
    @Id
    int id;
    String name;
    String city;

}
