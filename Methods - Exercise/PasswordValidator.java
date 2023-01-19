import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String password = scanner.nextLine();

        if (!printSymbolsFrom6To10(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!isLettersAndDig(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!weNeed2Digit(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (printSymbolsFrom6To10(password) && isLettersAndDig(password) && weNeed2Digit(password)) {
            System.out.println("Password is valid");

        }

    }
    public static boolean printSymbolsFrom6To10 (String password) {
        if (password.length() >= 6 && password.length()<= 10){
            return true;
        } else {
            return false;
        }

    }
    public static boolean isLettersAndDig (String password) {

        for (char index : password.toCharArray()) {
            if (!Character.isLetterOrDigit(index)) {
                return false;
            }
        }
                return true;
            }
    public static boolean weNeed2Digit (String password) {
        int count = 0;

        for (char symbol:password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }

    }
}

