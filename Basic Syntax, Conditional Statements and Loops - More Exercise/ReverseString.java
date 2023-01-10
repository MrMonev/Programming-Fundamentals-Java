import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String stringReverse = "";
        char reverseElements;
        for (int i = 0; i < input.length() ; i++) {

            reverseElements = input.charAt(i);
            stringReverse = reverseElements + stringReverse;
        }
        System.out.println(stringReverse);
    }
}
