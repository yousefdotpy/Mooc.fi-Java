
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> inputs = new ArrayList<>();

        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(Integer.valueOf(row));
        }
        System.out.println(positive(inputs));

    }
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> positiveList = numbers.stream()
                .filter(s -> s >0)
                .collect(Collectors.toList());
        return positiveList;
    }

}
