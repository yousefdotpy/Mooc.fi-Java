
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(10);
        counter.decrease(10);
        counter.increase();
        counter.increase(20);
        System.out.println(counter.value());
    }
}
