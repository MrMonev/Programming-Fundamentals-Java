import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    double[] numbersArr = Arrays.stream(scanner.nextLine().
            split(" ")).
            mapToDouble(Double::parseDouble).toArray();

                // 8.0 2.0 2.0 8.0 2.0
        // Минаваме през всеки един елемент,
        // ако елемента го има го пребояваме, ако не го добавяме!
                 // 8.0 - 2
                 // 2.0 - 3
         TreeMap<Double,Integer> countMap = new TreeMap<>();
             for (double num: numbersArr) {
                 if (!countMap.containsKey(num)) {

                     // Ако не се съдържа даденото число добавяме го и му даваме стойност 1
                     countMap.put(num, 1);
                 } else {
                     // Как се взима стойност на конкретен ключ
                    int value = countMap.get(num);
                    // може също дирекно countMap.put(num,countMap.get(num);)
                     countMap.put(num,value + 1);
                 }
             }
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
