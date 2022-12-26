import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        StringBuilder password = new StringBuilder();

        for (int position = userName.length() - 1; position >= 0; position--) {
            char currentSymbol = userName.charAt(position);
            password.append(currentSymbol);

        }

        String enteredPassword = scanner.nextLine();
        int countFailedTry = 0;

        while (!enteredPassword.equals(password.toString())) {
            countFailedTry++;
            if (countFailedTry == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();

        }
        if (enteredPassword.equals(password.toString())) {
            System.out.printf("User %s logged in.", userName);

        }
    }
}
