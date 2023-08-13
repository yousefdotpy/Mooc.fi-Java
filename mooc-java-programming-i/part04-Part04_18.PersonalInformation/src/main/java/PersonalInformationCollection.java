
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String fName = scanner.nextLine();
            if (fName.isEmpty()) {
                break;
            }
            String lName = scanner.nextLine();
            String  id = scanner.nextLine();

            PersonalInformation personalInformation = new PersonalInformation(fName,lName,id);
            infoCollection.add(personalInformation);

        }
        for (PersonalInformation info:infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }


    }
}
