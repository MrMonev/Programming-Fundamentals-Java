import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            // запазваме командите в отделен масив
            String[] commandArr = input.split(" ");
            // дай ми командата на индекс [0];
            String command = commandArr[0];

            switch (command) {
                case "swap":
                    // Запазваме индексите които трябва да манипулираме 1,3
                    int swapFirstIndex = Integer.parseInt(commandArr[1]);
                    int swapSecondIndex = Integer.parseInt(commandArr[2]);
                    // запазваме стойнистите на самите индекси; [1] - (-2);  [2] - (87);
                    int valueAtFirstIndex = numberArr[swapFirstIndex];
                    int valueAtSecondIndex = numberArr[swapSecondIndex];
                    // от масива със всички числа вземаме първия индекс и го разменяме с вротия,
                    // и обратното от втория индекс да вземем стойноста на първия
                    numberArr[swapFirstIndex] = valueAtSecondIndex;
                    numberArr[swapSecondIndex] = valueAtFirstIndex;
                    break;
                case "multiply":
                    int multiplyFirstIndex = Integer.parseInt(commandArr[1]);
                    int multiplySecondIndex = Integer.parseInt(commandArr[2]);
                    // В оделна променлива запазваме стойноста на умножението между двата индекса
                    int product = numberArr[multiplyFirstIndex] * numberArr[multiplySecondIndex];
                    // запазваме резултата от 2-та инекса в първия индекс (по условие);
                    numberArr[multiplyFirstIndex] = product;
                    break;
                case "decrease":
                    for (int i = 0; i < numberArr.length; i++) {
                        numberArr[i] = numberArr[i] -1;
                    }

                    break;
            }


            input = scanner.nextLine();
        }
      String[] resultArr = new String[numberArr.length];
        for (int i = 0; i <  resultArr.length; i++) {
            resultArr[i] = String.valueOf(numberArr[i]);
        }
        System.out.println(String.join(", ", resultArr));
    }
}
