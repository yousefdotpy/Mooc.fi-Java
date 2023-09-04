import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;

    public Employees() {
        employees = new ArrayList<>();
    }
    public void add(Person personToAdd){
        employees.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd){
        employees.addAll(peopleToAdd);
    }
    public void print(){
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
    }

    public void print(Education education){
        employees.stream().
                filter(e -> e.getEducation().equals(education)).
                forEach(System.out::println);
    }
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
