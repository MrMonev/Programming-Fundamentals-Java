import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chest = Arrays.stream(scanner.nextLine()
                .split("\\|")).collect(Collectors.toList());


        List<String> commandList = Arrays.asList(scanner.nextLine().split(" "));
        while (!"Yohoho!".equals(commandList.get(0))) {
//            String[] commandArr = input.split(" ");
//            String command = commandArr[0];


            String command = commandList.get(0);
           switch (command) {
               case "Loot":
                   List<String> loots = commandList.subList(1,commandList.size());
                   for (String item:loots) {
                       if(!chest.contains(item)) {
                           chest.add(0,item);
                       }
                   }
                   break;

               case "Drop":
                   int index = Integer.parseInt(commandList.get(1));
                   if (index >= 0 && index < chest.size()){
                       String removedItem = chest.get(index);
                       chest.remove(removedItem);
                       chest.add(removedItem);
                   }
                   break;

               case "Steal":
                   int count = Integer.parseInt(commandList.get(1));
                   int result = commandList.size() - count;
                   List<String> stealItems = new ArrayList<>();

                   if (result > 0) {
                       for (int i = result; i < chest.size(); i++) {
                           String item = chest.remove(i--);
                          stealItems.add(item);
                       }
                   } else {
                       for (int i = 0; i < chest.size() ; i++) {
                           String item = chest.remove(i--);
                           stealItems.add(item);
                       }
                   }
                   System.out.println(String.join(", ",stealItems));
                   break;
           }

            commandList = Arrays.asList(scanner.nextLine().split(" "));
        }
        if (chest.isEmpty() ) {
            System.out.println("Failed treasure hunt.");
        } else {
            double sum = 0;
            for (String item: chest) {
                sum = sum + item.length();
            }
            double avgGain = sum / chest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.%n",avgGain);
        }
    }
}
