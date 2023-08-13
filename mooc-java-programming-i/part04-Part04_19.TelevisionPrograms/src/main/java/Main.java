import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            int duration = Integer.valueOf(scanner.nextLine());
            TelevisionProgram televisionProgram = new TelevisionProgram(name,duration);
            programs.add(televisionProgram);
        }
        int maxDuration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program: programs) {
            if (program.getDuration() <= maxDuration){
                System.out.println(program);
            }
        }

    }
}
