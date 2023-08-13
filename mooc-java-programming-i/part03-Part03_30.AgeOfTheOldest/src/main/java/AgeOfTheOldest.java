
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max =-1 ;
        while (true){
            String string = scanner.nextLine();
            if (string.isEmpty()) {
                break;
            }
            String[] strings = string.split(",");
            int ag = Integer.valueOf(strings[1]);
            if (max <= ag) {
                max = ag;
            }


        }
        System.out.println("Age of the oldest: " + max);

    }
}
