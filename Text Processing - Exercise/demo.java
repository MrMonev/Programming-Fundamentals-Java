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

        //8. Започва с определен текст -> true (ако започва), false(ако не започва)
        System.out.println(name.startsWith("DA"));

        //9. Завършва на определен текст -> ture (ако завършва), false(ако не завършва)
        System.out.println(name.endsWith("Ne"));

        //10. Премахва интервалите в началото и края на текста
        System.out.println(" Ivaylo    ".trim());

        //11. Заменя първото срещане на даден текст или символ
        name.replace("lo", "Ne");// Ivaylo - "IvayNe"
        name.replace('I', 'B'); // Ivaylo - "Baylo"

        //12. заменя всички срещания на текста
        name.replaceAll("a", "b"); // Ivaylo - "IvBylo"

        //13. Повтаряме текста даден брой пъти
        System.out.println(name.repeat(5)); //IvayloIvayloIvayloIvayloIvaylo

        //14. Взимаме текст, който е част от друг текст

        System.out.println(name.substring(2));     // "Ivaylo" - "aylo"
        System.out.println(name.substring(1,5)); // Ivaylo - "vayl"
    }
}
