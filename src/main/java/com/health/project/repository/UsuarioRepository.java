/*import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.example.demo.entityes.Student;

import java.util.Map;

@Repository

public class StudentRepo {

    private Map<Integer,Student> data = new HashMap<>();

    public StudentRepo(){

data.put(1, new Student(
    1,
    "Ansu",
    "Fati",
    23,
    "ansu.fati@example.com",
    "Futbolista",
    "URL_IMAGEN"
));

data.put(2, new Student(
    2,
    "Lionel",
    "Messi",
    39,
    "messi@example.com",
    "Futbolista",
    "URL_IMAGEN"
));

data.put(3, new Student(
    3,
    "Cristiano",
    "Ronaldo",
    41,
    "cristiano@example.com",
    "Futbolista",
    "URL_IMAGEN"
));

data.put(4, new Student(
    4,
    "Kylian",
    "Mbappe",
    27,
    "mbappe@example.com",
    "Futbolista",
    "URL_IMAGEN"
));
    } 


    public Student findById(Integer id){
        return data.get(id);
    }

    public Collection<Student> findAll(){
        return data.values();
    }
}
*/
