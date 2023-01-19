import java.text.DecimalFormat;
import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // метод който принтира средната буква,
        // Ако стринга е четен принтираме 2 средни букви;
        printMiddleCharacters(text);
        printMiddleEvenCharacters(text);
    }
    public static void printMiddleCharacters (String text) {

        int length = text.length();
        int midChar = length / 2;
        if (length % 2 == 1) {
            System.out.println(text.charAt(midChar));
        }
    }
    public static void printMiddleEvenCharacters (String text) {
        int length = text.length();
        int midChar = length / 2;
        if (length % 2 == 0) {
            System.out.print(text.charAt(midChar - 1));
            System.out.println(text.charAt(midChar));
        }
    }

}
