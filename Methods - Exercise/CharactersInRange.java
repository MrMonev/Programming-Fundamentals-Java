import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbolOne = scanner.nextLine().charAt(0);
        char symbolTwo = scanner.nextLine().charAt(0);


        printCharactersInRange(symbolOne, symbolTwo);
    }

    public static void printCharactersInRange(char symbolOne, char symbolTwo) {
        // проверка за по малък символ -> започвам от по малкият символ
        if (symbolOne < symbolTwo) {
            // започваме от символ 1
            for (char symbol = (char) (symbolOne + 1); symbol < symbolTwo; symbol++) {
                System.out.print(symbol + " ");
            }
        } else {
            // symbol1 >= symbol2
            // започваме от символ2
                for (char symbol = (char) (symbolTwo + 1); symbol < symbolOne; symbol++) {
                    System.out.print(symbol + " ");


            }

        }
    }
}
