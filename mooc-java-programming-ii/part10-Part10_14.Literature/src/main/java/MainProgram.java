
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true){
            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());
            Book book = new Book(input, age);
            books.add(book);
        }
        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecommendedAge)
                .thenComparing(Book::getTitle);

        books.sort(comparator);
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
        books.forEach(s -> System.out.println(s.getTitle() + " (recommended for " + s.getRecommendedAge() + " year-olds or older)"));

    }

}
