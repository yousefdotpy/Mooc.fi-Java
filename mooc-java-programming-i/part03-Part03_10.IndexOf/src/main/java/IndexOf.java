
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for? ");
        int num = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> idx = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (num == list.get(i)) {
                idx.add(i);
            }
        }
        for (int i =0 ; i < idx.size(); i++) {
            System.out.println(  num + " is at index " + idx.get(i));
        }
    }
}
