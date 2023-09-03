
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(x -> x.split(","))
                    .sorted((x, y) -> x[5].compareTo(y[5]))
                    .forEach(line -> System.out.println(line[3] + " (" + line[4] + "), " + line[2].split(" ")[1].trim() + ", " + line[5]));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
