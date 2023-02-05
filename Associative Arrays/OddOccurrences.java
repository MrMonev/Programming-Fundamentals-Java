import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        // Използваме LinkedHashMap - за да може да ги принтираме в последователен ред!
        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word: inputArr) {
            word = word.toLowerCase(Locale.ROOT);
           //Ако не се съдържа думата, добави ми key + value 0;
            wordsMap.putIfAbsent(word, 0);
            // Добави ми думата и на тази дума ми дай нейната стоийност + 1
            wordsMap.put(word,wordsMap.get(word) + 1);

            // Това е същата проверка която правим отгоре с putIfAbsent
//            if (!wordsMap.containsKey(word)) {
//                wordsMap.put(word, 0);
//            }
//            wordsMap.put(word,wordsMap.get(word) + 1);
        }
        List<String> resultList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            // Ако value на даденият ключ не е четен
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", resultList));
    }
}
