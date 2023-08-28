public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public int compareTo(Human other) {
        // Compare this Human's wage to the other Human's wage in descending order
        return Integer.compare(other.wage, this.wage);
    }

    @Override
    public String toString() {
        return name + " " + wage;
    }
}
