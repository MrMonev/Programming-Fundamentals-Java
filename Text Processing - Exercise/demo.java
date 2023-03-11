import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Ivaylo";

        //1. Дължина на текст =
        System.out.println(name.length());

        // 2. Само главни букви
        System.out.println(name.toUpperCase());
        // 3 само с малки букви
        System.out.println(name.toLowerCase());

        // 4. в Масив от символи: Ivaylo -> [I],[v],[a],[y],[l],[o]
        char[] symbols = name.toCharArray();

        // 5. Сравняване на текстове -> true, false
        System.out.println("Ivaylo".equals(name));
        System.out.println("IvaYLo".equalsIgnoreCase(name));

        //6. Достъпваме символ от текста
        // позиция( index ) = 0 -> първия символ
        // позиция( index ) = дължина на текст - 1 -> последния символ
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));

        //7. Съдържа определен текст ->
        // true(ако се съдържа)
        // false (ако не се съдържа)
        System.out.println(name.contains("Skina"));
    }
}
