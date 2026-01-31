import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person>singleCriteria = new ArrayList<Person>();
        for(Person person:persons){
            if(person.getMaritalStatus().equalsIgnoreCase("Single")){
                singleCriteria.add(person);
            }
        }
        return singleCriteria;
    }
}
