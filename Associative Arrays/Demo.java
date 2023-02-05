import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     String[] wordArr = {"abc", "bla","sae"};

     wordArr = Arrays.stream(wordArr)
             .map(e -> e + "yyy")
             .toArray(String[]::new);
    }
}
//   LinkedHashMap<String, Double> fruitsMap = new LinkedHashMap<>();
//
//        fruitsMap.put("apple", 1.60);
//        fruitsMap.put("banana", 3.20);
//
//        for (Map.Entry<String, Double> entry : fruitsMap.entrySet()) {
//            String currentKey = entry.getKey();
//            double currentValue = entry.getValue();
//
//            System.out.printf("%s - %.2f1%n",currentKey,currentValue);
//        }