import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String totalSymbols = " ";

        for (int firstSymbol = 0; firstSymbol < 3; firstSymbol++) {
            char symbols = scanner.nextLine().charAt(0);

            String allInOne = String.valueOf(symbols);
            totalSymbols += allInOne;


            System.out.print(allInOne);
        }
    }
}
