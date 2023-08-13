
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("File? ");
        String file = scanner.nextLine();
//        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        int upperBound = Integer.valueOf(scanner.nextLine());
        try {
            Scanner fileScanner = new Scanner(Paths.get(file));
            int cnt = 0;
            while (fileScanner.hasNextLine()){
                String row = fileScanner.nextLine();
                int num = Integer.valueOf(row);

                if (num >= lowerBound && num <= upperBound) {
                    cnt++;
                }

            }
            System.out.println("Numbers: " + cnt);
        } catch (IOException e) {
            System.out.println("Reading the file nonexistent.txt failed.");
        }


    }

}
