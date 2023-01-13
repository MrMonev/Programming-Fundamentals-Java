import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // all items stored it inside in our chestBox[]

        String[] chest = scanner.nextLine().split("\\|");

        // commands from console
        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {

            // if the command is !Yohoho - we need new String[]
            // To keep all commands and separate with  " ";

            String[] everyPart = input.split(" ");

            // Checking the command with index [0] - then we create for loop
            // our index must start with index [1] - just because we separate our commands,
            // and we already use the first index witch is [0]
            // Then checking our chestBox with the items what we have inside.
            // For this we need (boolean) is its true brake, if it's false
            // create new string chest with all elements which they are not in our chestBox
            // and add them with space (" ")
            switch (everyPart[0]) {
                case "Loot":
                    for (int i = 1; i < everyPart.length; i++) {
                        boolean itISInside = false;
                        for (int j = 0; j < chest.length; j++) {
                            if (everyPart[i].equals(chest[j])) {
                                itISInside = true;
                                break;
                            }
                        }
                        if (!itISInside) {
                            String newChest = everyPart[i] + " " + String.join(" ", chest);
                            chest = newChest.split(" ");
                        }
                    }
                    break;
                // Remove the element at the given position (console) and add it to the end
                // of the chestBox.If the index is invalid, skip the command.

                case "Drop":
                    int number = Integer.parseInt(everyPart[1]);

                    if (number <= chest.length - 1 && number >= 0) {
                        String dropItem = chest[number];
                        for (int i = number; i < chest.length - 1; i++) {
                            chest[i] = chest[i + 1];
                        }
                        chest[chest.length - 1] = dropItem;
                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    //	Someone steals the last count element items.
                   // If there are fewer items than the given count, remove as many as there are.

                    int stealItems = Integer.parseInt(everyPart[1]);

                    if (stealItems >= 0 && stealItems < chest.length) {
                        for (int i = 0; i < stealItems; i++) {
                            System.out.print(chest[chest.length - stealItems + i]);
                            if (i != stealItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] temporaryChest = new String[chest.length - stealItems];
                        for (int i = 0; i < temporaryChest.length; i++) {
                            temporaryChest[i] = chest[i];
                        }
                        chest = temporaryChest;

                    } else if (stealItems >= 0) {
                        for (int i = 0; i < chest.length; i++) {
                            System.out.print(chest[i]);
                            if (i != chest.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        chest = new String[0];
                    }
                    System.out.println();
                    break;

            }
            input = scanner.nextLine();
        }
        //In the end, output the average treasure gain, which is the sum of all chest items
        // length divided by the count of all items inside the chest formatted to the second decimal point:

        String chestCount = String.join("", chest);
        int counter = 0;

        for (int i = 0; i < chestCount.length(); i++) {
            counter++;
        }
        double averageTreasure = (1.0 * counter) / chest.length;
        if (counter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
