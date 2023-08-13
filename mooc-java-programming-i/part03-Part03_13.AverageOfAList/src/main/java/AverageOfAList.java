
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            } else {
                list.add(input);
            }
        }
        int sum = 0;
        for (int num : list) {

            sum += num;

        }
        System.out.println("Average: " + (double) sum / (double) list.size() * 1.0);
    }
}
