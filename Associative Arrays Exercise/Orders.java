import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> productsPrice = new LinkedHashMap<>();

        while (!data.equals("buy")) {
            String product = data.split("\\s+")[0];
            double price = Double.parseDouble(data.split("\\s+")[1]);
            int quantity = Integer.parseInt(data.split("\\s+")[2]);

            // За количество -> не сме срещали такъв продукт
            if (!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantity);
            } else {
                int currentQuantity = productsQuantity.get(product);
                productsQuantity.put(product, currentQuantity + quantity);
            }


            // За цена -> Всеки път да добавяме срещу продукта въведената

            productsPrice.put(product, price);

            data = scanner.nextLine();
        }
        //Продукт -> количество
        // Продкукт -> ед. цена

        //продукт -> колко е платено за него(количество * ед. цена)
        for (Map.Entry<String, Integer> entry: productsQuantity.entrySet()){
            // entry
            // key (име на продукта)
            // value (брой)

            String productName = entry.getKey();
            double finalSum = productsQuantity.get(productName) * productsPrice.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
