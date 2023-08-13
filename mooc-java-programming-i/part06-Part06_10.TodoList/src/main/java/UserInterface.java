import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")){
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String add = scanner.nextLine();
                this.todoList.add(add);
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int removed = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(removed);
            } else if (command.equals("list")) {
                this.todoList.print();
            }
        }
    }
}
