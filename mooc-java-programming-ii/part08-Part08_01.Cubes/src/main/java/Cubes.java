
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                int cube = (int) Math.pow(Integer.valueOf(input),3);
                System.out.println(cube);
            }

        }

    }
}
