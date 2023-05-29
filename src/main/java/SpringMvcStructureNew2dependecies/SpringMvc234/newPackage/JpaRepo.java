package SpringMvcStructureNew2dependecies.SpringMvc234.newPackage;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRepo extends MongoRepository<PojoStudent,Integer> {

}
