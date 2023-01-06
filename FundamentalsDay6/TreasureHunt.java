import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] chest = scanner.nextLine().split("\\|");

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            String[] everyPart = input.split(" ");

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
