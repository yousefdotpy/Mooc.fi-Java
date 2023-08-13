
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0 ;
        int cnt = 0;
        String max = "";
        while (true){
            String string = scanner.nextLine();
            if (string.isEmpty()) {
                break;
            }
            cnt ++;
            String[] strings = string.split(",");
            int ag = Integer.valueOf(strings[1]);
            sum += ag;
            if (max.length() < strings[0].length()) {
                max = strings[0];

            }


        }
        System.out.println("Longest name: " + max);
        System.out.println("Average of the birth years: " + (double) sum /(double) cnt * 1.0);

    }
}
