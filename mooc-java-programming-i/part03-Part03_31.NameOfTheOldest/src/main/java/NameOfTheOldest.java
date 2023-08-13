
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max =-1 ;
        String ld = "";
        while (true){
            String string = scanner.nextLine();
            if (string.isEmpty()) {
                break;
            }
            String[] strings = string.split(",");
            int ag = Integer.valueOf(strings[1]);

            if (max <= ag) {
                max = ag;
                ld = strings[0];
            }



        }
        System.out.println("Name of the oldest: " + ld);

    }
}
