
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true){

            int in = Integer.valueOf(scanner.nextLine());
            if (in == 9999) {
                break;
            }
            list.add(in);
        }
        ArrayList<Integer> small = new ArrayList<>();
        int smallest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                small.add(i);
            }

        }
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < small.size(); i++) {
            System.out.println("Found at index: " +(small.get(i)));
        }
        
    }
}
