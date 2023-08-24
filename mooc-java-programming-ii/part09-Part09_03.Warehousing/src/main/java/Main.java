
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years) ";
    }
}

// ------------------

class Student extends Person {

    private int credits;

    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    @Override
    public String toString() {
        return super.toString() + credits + " credits";
    }

}
public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        Student student = new Student("Kenny", 23, 140);

        Person person = student;
        Object object = student;

        System.out.print(student + ", ");
        System.out.print(person + ", ");
        System.out.println(object);
    }

}
