import java.awt.print.Book;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<BookList> books = new ArrayList();
        while (true){
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            int pages = Integer.valueOf(scanner.nextLine());
            int publicationYear = Integer.valueOf(scanner.nextLine());

            BookList book = new BookList(name,pages,publicationYear);
            books.add(book);
        }
        String string = scanner.nextLine();
        if (string.equals("name")) {
            for (BookList book:books) {
                System.out.println(book.getName());
            }
        } else {
            for (BookList book:books) {
                System.out.println(book);
            }
        }

    }
}
