import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> guestsList = new ArrayList<>();
        for (int i = 0; i < numberOfCommands; i++) {
            String input = scanner.nextLine();
            String[] command = input.split("\\s+");

            boolean isInTheList = false;
            boolean isNotInTheList = false;

            if (!"not".equalsIgnoreCase(command[2])) {

                for (String name : guestsList) {

                    if (name.equals(command[0])) {
                        isInTheList = true;
                        break;
                    }
                }
                if (isInTheList) {
                    System.out.printf("%s is already in the list!%n", command[0]);

                } else {
                    guestsList.add(command[0]);

                }
            } else {

                for (String name : guestsList) {
                    if (!name.equals(command[0])) {
                        isNotInTheList = true;
                    } else {
                        isNotInTheList = false;
                        break;
                    }
                }
                if (isNotInTheList) {
                    System.out.printf("%s is not in the list!%n", command[0]);
                } else {
                    guestsList.remove(command[0]);
                }
            }
        }
        for (String name : guestsList) {
            System.out.println(name);
        }
    }
}

