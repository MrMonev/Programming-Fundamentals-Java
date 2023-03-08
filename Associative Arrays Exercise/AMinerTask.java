import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {

        Map<String, Integer> collections = new LinkedHashMap<>();
        String collection = "";

        Scanner scanner = new Scanner(System.in);


        while (!collection.equals("stop")) {
            collection = scanner.nextLine();

            if (!collection.equals("stop")) {

                if (!collections.containsKey(collection)) {
                    collections.put(collection, 0);
                    int quantity = Integer.parseInt(scanner.nextLine());
                    collections.put(collection, collections.get(collection) + quantity);
                } else {
                    int quantity = Integer.parseInt(scanner.nextLine());
                    collections.put(collection, collections.get(collection) + quantity);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : collections.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.printf("%s -> %d%n", key, value);
        }
    }
}
