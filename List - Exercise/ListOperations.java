import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).
                collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.contains("End")) {

            if (command.contains("Add")) {

                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numberToAdd);
            } else if (command.contains("Insert")) {

                int numberToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                // Проверка дали индекса същестува
                // 3,4,5,9, 12 = 0, number.size - 1
                if (isValidIndex(index, numbers)) {
                    // Валиден индекс
                    numbers.add(index,numberToInsert);
                } else {
                    // Невалиден индекс
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int removeIndex = Integer.parseInt(command.split("\\s+")[1]);
                if (isValidIndex(removeIndex, numbers)) {
                    //Проверка дали индекса същестува
                    // 3,4,5,9, 12 = 0, number.size - 1
                    //Валиден Индекс
                    numbers.remove(removeIndex);
                } else {
                    // Невалиден индекс
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]);
                for (int time = 1; time <= countShiftLeft ; time++) {
                    int firstNum = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNum);
                }
            } else if (command.contains("Shift right")) {
                int countShiftRight = Integer.parseInt(command.split("\\s+")[2]);
                for (int time = 1; time <= countShiftRight ; time++) {
                    int lastNum = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0,lastNum);
                }
            }
            command = scanner.nextLine();
        }
        for (int number: numbers) {
            System.out.print(number + " ");
        }
    }
    // Метод който проверява дали даден индекс е валиден
    // true -> ако е валиден индес -> [0, size - 1]
    // false -> невалиден индекс
    public static boolean isValidIndex (int index, List<Integer> numbers) {
        return index >= 0 && index <= numbers.size() - 1;
    }
}
