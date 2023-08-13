
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.print("Search for? ");
        boolean found = false;
        String name = scanner.nextLine();
        for (String nams : list) {
            if (nams.equals(name)) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println(name + " was found!");
        } else {
            System.out.println(name + " was not found!");
        }


    }
}
