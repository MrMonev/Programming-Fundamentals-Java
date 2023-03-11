import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();// Първоначален текст: Programing is cool!
        StringBuilder encryptedText = new StringBuilder();


        for (char symbol : text.toCharArray()) {
            // 'A' -> 'D'
            char encryptSymbol = (char) (symbol + 3);// Криптиран символ
            encryptedText.append(encryptSymbol);

        }
        System.out.println(encryptedText);

    }
}
