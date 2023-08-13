
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        try {
            Scanner fileScanner = new Scanner(Paths.get(file));
            while (fileScanner.hasNextLine()){
                String row = fileScanner.nextLine();
                String[] line = row.split(",");
                System.out.println(line[0] + ", age: " + line[1] + " years");
            }
        } catch (IOException e) {
            System.out.println("Reading the file nonexistent.txt failed.");
        }


    }
}
