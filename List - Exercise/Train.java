import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] input = command.split(" ");
            if (input[0].equals("Add")) {
                // Когато имаме команда Add
                int passengers = Integer.parseInt(input[1]);
                wagons.add(passengers);
            } else {
                // Когато имаме само число
                int passengerAdd = Integer.parseInt(input[0]);

                for (int index = 0; index < wagons.size(); index++) {
                    int currentWagon = wagons.get(index);
                    if (currentWagon + passengerAdd <= maxCapacity) {
                        wagons.set(index, currentWagon + passengerAdd);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        wagons.forEach(wagon -> System.out.print(wagon + " "));
    }

}

