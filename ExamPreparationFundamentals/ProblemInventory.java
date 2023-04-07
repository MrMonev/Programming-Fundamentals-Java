import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ProblemInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"Craft".equals(command)) {

            String[] separateCommand = command.split(" - ");
            String firstCommand = separateCommand[0];
            String item = separateCommand[1];

            switch (firstCommand) {
                case "Collect":
                if (!itemList.contains(item)) {
                    itemList.add(item);
                }
                break;
                case "Drop":
                    if (itemList.contains(item)) {
                        itemList.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] split = item.split(":");
                    String oldItem = split[0];
                    String newItem = split[1];
                    int index = itemList.indexOf(oldItem) + 1;
                    if (itemList.contains(oldItem)) {
                        itemList.add(index, newItem);
                }
                    break;
                case "Renew":
                    if (itemList.contains(item)) {
                        index = itemList.indexOf(item);
                        itemList.remove(item);
                        itemList.add(item);
                    }
                    break;
            }
            command = scanner.nextLine();
            if (command.equals("Craft!")) {
                break;
            }
        }
        System.out.println(String.join(", ",itemList));
    }
}