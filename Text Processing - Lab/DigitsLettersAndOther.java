import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digitStringBul = new StringBuilder();
        StringBuilder letterStringBul = new StringBuilder();
        StringBuilder otherStringBul = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (Character.isDigit(symbol)) {
                digitStringBul.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letterStringBul.append(symbol);
            } else {
                otherStringBul.append(symbol);
            }
        }

        System.out.println(digitStringBul);
        System.out.println(letterStringBul);
        System.out.println(otherStringBul);
    }
}
