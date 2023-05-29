package SpringMvcStructureNew2dependecies.SpringMvc234.newPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceMain {


    @Autowired
    private JpaRepo jrepo;


    public PojoStudent AddStudentAndCreate(PojoStudent sts) {
      return  jrepo.save(sts);



    }
    public PojoStudent UpdateAndAddStudent(PojoStudent sts)
    {

       PojoStudent ppp= jrepo.findById(sts.getId()).get();
       ppp.setName(sts.getName());
       ppp.setId(sts.getId());
       ppp.setRoll_Number(sts.getRoll_Number());
      return  jrepo.save(ppp);


    }
    public String deleteStudent(int id)
    {

        PojoStudent ppp=jrepo.findById(id).get();
        jrepo.delete(ppp);
        return "delete successFully";
    }

    public List<PojoStudent> getAllData(){
        return jrepo.findAll();
    }

}
