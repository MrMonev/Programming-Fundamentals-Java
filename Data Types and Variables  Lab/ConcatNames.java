import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String saveFirstName = "";
        String saveSecondName = "";
        String saveSymbols = "";


            String firstName = scanner.nextLine();
            saveFirstName += firstName;

            String secondName = scanner.nextLine();
            saveSecondName += secondName;

            String symbols = scanner.nextLine();

                saveSymbols += symbols;

        System.out.printf("%s%s%s", saveFirstName, saveSymbols, saveSecondName);
    }
}
//         char symbols = scanner.nextLine().charAt(0);
//            String symbol = String.valueOf(symbols);
//            saveSymbols += symbol;
//