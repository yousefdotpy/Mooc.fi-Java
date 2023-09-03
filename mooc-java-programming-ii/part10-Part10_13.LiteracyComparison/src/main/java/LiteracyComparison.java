
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(x -> x.split(","))
                    .sorted((x, y) -> x[5].compareTo(y[5]))
                    .forEach(row -> System.out.println(row[3] + " (" + row[4] + "), " + row[2].split(" ")[1].trim() + ", " + row[5]));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
