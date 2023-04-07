import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventoryList = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            // Collect - Gold
            String[] commandArr = input.split(" - ");
            String command = commandArr[0];

            switch (command) {
                case "Collect":
                    String addItem = commandArr[1];
                    if (!inventoryList.contains(addItem)) {
                        inventoryList.add(addItem);
                    }
                    break;
                case "Drop":
                    String removeItem = commandArr[1];
                    inventoryList.remove(removeItem);
                    break;
                case "Combine Items":
                    // Раздлеме Items за да може да им вземем всеки един индекс
                    String[] items = commandArr[1].split(":");
                    // в оделни String променливи си запазваме инексите на нашите Items
                    String oldItem = items[0];
                    String newItem = items[1];
                    // Ако съдържа стария Item:
                    if (inventoryList.contains(oldItem)) {
                        //В оделна променлива дай ми на стария Item индекса и го запази
                        int indexOldItem = inventoryList.indexOf(oldItem);
                        // Добави ми Стария индекс + 1 (или по ясно,Сложи ми на стария индекс, новия след него) (0+1)

                        inventoryList.add(indexOldItem + 1, newItem);
                    }
                    break;
                case "Renew":
                    String renewItem = commandArr[1];
                    if(inventoryList.contains(renewItem)) {
                        inventoryList.remove(renewItem);
                        inventoryList.add(renewItem);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", inventoryList));
    }
}
