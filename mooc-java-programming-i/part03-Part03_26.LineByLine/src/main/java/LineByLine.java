
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String string = scanner.nextLine();
            if (string.isEmpty()) {
                break;
            }
            String[] strings = string.split(" ");
            for (String s: strings) {
                System.out.println(s);
            }
        }

    }
}
