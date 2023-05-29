package SpringMvcStructureNew2dependecies.SpringMvc234.mongoCrudOperation;

//import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends MongoRepository<StudentClass,Integer> {
}
