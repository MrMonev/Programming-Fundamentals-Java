import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        // Символ -> бр. срещания

        Map<Character, Integer> symbolCount = new LinkedHashMap<>();
        // HashMap -> няма значение редът на записите
        // LinkedHashMap -> записите се подреждат спрямо реда на добавяне
        // TreeMap -> записите се подреждат спрямо техния ключ

        for (char symbol:text.toCharArray()) {
            // "Ivaylo" -> ['I','v','a','y','l','o']

            if(symbol == ' '){
                continue; // Пропуска всичко надолу и преминава към следващия символ
            }

            // 1. Да не съм срещал таъкв символ
            if(!symbolCount.containsKey(symbol)) {
                symbolCount.put(symbol, 1);
            }
            // 2. Да съм срещал такъв символ
            else {
                // Текущия брой срещания
                int currentCount = symbolCount.get(symbol);
                symbolCount.put(symbol,currentCount + 1);
            }
        }
        // Отпечатваме:
        // символ -> бр. на срещания
        symbolCount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
