
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        double positiveAvg = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> s > 0)
                .average()
                .getAsDouble();

        double negativeAvg = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(s -> s < 0)
                .average()
                .getAsDouble();

        String output = ((scanner.nextLine().equals("p")) ? "Average of the positive numbers: " + positiveAvg : "Average of the negative numbers: " + negativeAvg);
        System.out.println(output);



    }
}
