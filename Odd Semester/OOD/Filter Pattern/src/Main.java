import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Person>person = new ArrayList<Person>();
        person.add(new Person("alamin", "male", "sigle"));
        person.add(new Person("rakib","male","married"));
        person.add(new Person("moni","female","single"));
        person.add(new Person("smriti","female","married"));

        Criteria female = new FemaleCriteria();
        Criteria male = new MaleCriteria();
        Criteria single = new SingleCriteria();
        Criteria andCriteria = new AndCriteria(female, single);
        Criteria orCriteria  = new OrCriteria(male,female);


        System.out.println("Males");
        PrintPerson(orCriteria.meetCriteria(person));



    }

    public static void PrintPerson(List<Person>persons){
        for(Person person:persons) {
            System.out.println("Name: " +person.getName() +"; Gender: "+person.getGender()+"; Marital Status: "+person.getMaritalStatus());
        }
    }
}