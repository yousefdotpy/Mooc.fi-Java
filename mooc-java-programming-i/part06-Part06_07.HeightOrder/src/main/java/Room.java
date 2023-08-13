import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
    public Room(){
        people = new ArrayList<>();
    }
    public boolean isEmpty(){
        return people.isEmpty();
    }
    public void add(Person person){
        people.add(person);
    }
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    public Person shortest(){
        if (people.isEmpty()) {
             return null;
        }
        Person shortest = people.get(0);
        for (Person person: people) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    public Person take(){
        Person taken = shortest();
        this.people.remove(shortest());
        return taken;
    }

}
