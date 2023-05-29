package SpringMvcStructureNew2dependecies.SpringMvc234.newPackage;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Course {


    @Id
    private Long id;
    private String name;
    private String author;

Course(Long id,String name,String author)
{
    super();

    this.id=id;
    this.name=name;
    this.author=author;
}
}
