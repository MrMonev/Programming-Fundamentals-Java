import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWait = Integer.parseInt(scanner.nextLine());

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).
                collect(Collectors.toList());

        for (int wagon = 0; wagon < wagons.size() ; wagon++) {
            if (peopleWait > 0) {
                int currentCountPeople = wagons.get(wagon);
                while (currentCountPeople < 4) {
                    if (peopleWait <= 0) {
                        break;
                    }
                 currentCountPeople++;
                 wagons.set(wagon, currentCountPeople);
                 peopleWait--;

                }
            }
        }
        if (peopleWait <= 0 && wagons.get(wagons.size() - 1) < 4) {
            System.out.println("The lift has empty spots!");
        } else if (peopleWait > 0 && wagons.get(wagons.size() - 1) >= 4){
            System.out.printf("There isn't enough space! %d people in a queue!%n",peopleWait);
        }
        System.out.println(wagons.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));

    }
}
