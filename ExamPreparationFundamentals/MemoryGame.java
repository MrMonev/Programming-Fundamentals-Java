import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals("end")) {
            count++;
            String[] tokens = input.split("\\s+");
            int firstIndex = Integer.parseInt(tokens[0]);
            int secondIndex = Integer.parseInt(tokens[1]);

            if (isInvalidGame(firstIndex,secondIndex, elementsList)) {
                System.out.println("Invalid input! Adding additional elements to the board");
                elementsList.add(elementsList.size() / 2, String.format("-%da",count));
                elementsList.add(elementsList.size() / 2, String.format("-%da",count));

            } else {
                String firstElement = elementsList.get(firstIndex);
                String secondElement = elementsList.get(secondIndex);
                if (firstElement.equals(secondElement)) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n",firstElement);
                    elementsList.remove(firstElement);
                    elementsList.remove(secondElement);
                } else {
                    System.out.println("Try again!");
                }
            }
            if (elementsList.isEmpty()) {
                break;
            }

            input = scanner.nextLine();
        }
        if (elementsList.isEmpty()) {
            System.out.printf("You have won in %d turns!%n",count);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ",elementsList));
        }
    }
    public static boolean isInvalidGame(int firstIndex, int secondIndex, List<String> elementsList) {
       if (isCheating(firstIndex, secondIndex) ||
               isInvalidIndex(firstIndex, elementsList) ||
               isInvalidIndex(secondIndex, elementsList)) {
           return  true;
       }
       return false;
    }

    public static boolean isInvalidIndex(int index, List<String> elementsLIst){
        if (index < 0 || index >= elementsLIst.size()) {
            return true;
        }
        return false;
    }
    public static boolean isCheating(int firstIndex, int secondIndex) {
        if (firstIndex == secondIndex) {
            return true;
        }
        return false;
    }
}
