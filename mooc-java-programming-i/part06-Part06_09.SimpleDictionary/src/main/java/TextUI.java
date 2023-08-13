import java.util.Scanner;

public class TextUI {
    private SimpleDictionary simpleDictionary;
    private Scanner scanner;
    public TextUI(Scanner scanner,SimpleDictionary simpleDictionary){
        this.simpleDictionary = simpleDictionary;
        this.scanner = scanner;
    }
    public void start(){
        while (true) {
            System.out.print("Command: ");
            String string = scanner.nextLine();
            if (string.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (string.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            } else if (string.equals("search")) {
                System.out.print("To be translated: ");
                String search = scanner.nextLine();
                String translation = simpleDictionary.translate(search);
                if (translation == null){
                    translation = "Word " + search + " was not found";
                    System.out.println(translation);
                } else {
                    System.out.println("Translation: " + translation);
                }
                
            } else {
                System.out.println("Unknown command");
            }
        }

    }

}
