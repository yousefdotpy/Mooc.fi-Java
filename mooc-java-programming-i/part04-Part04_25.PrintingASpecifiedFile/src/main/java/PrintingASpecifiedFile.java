
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fil = scanner.nextLine();
        Scanner scanner1 = new Scanner(Paths.get(fil));
        while (scanner1.hasNextLine()){
            String line = scanner1.nextLine();
            System.out.println(line);
        }
    }
}
