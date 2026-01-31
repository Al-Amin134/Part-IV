import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person>firstCriteria = criteria.meetCriteria(persons);
        List<Person>otherCriteria1 = otherCriteria.meetCriteria(persons);

        for(Person person:otherCriteria1){
            if(!firstCriteria.contains(person)){
                firstCriteria.add(person);
            }
        }
    return firstCriteria;
    }
}
