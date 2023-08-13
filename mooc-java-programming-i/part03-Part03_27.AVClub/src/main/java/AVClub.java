
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String string = scanner.nextLine();
            if (string.isEmpty()) {
                break;
            }
            String[] strings = string.split(" ");
            for (String s: strings) {
                if (s.contains("av") == true) {
                    System.out.println(s);
                }

            }
        }

    }
}
