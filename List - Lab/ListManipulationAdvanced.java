import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("end")) {
            String[] commandAndNum = command.split(" ");

            ContainsYesOrNo(numberList, commandAndNum);
            printEvenNumbers(numberList, command);
            printOddNumbers(numberList, command);
            printSumOfAllNumbers(numberList, command);
            printNumbersSmallerThanNumFromConsole(numberList, commandAndNum);


            command = scanner.nextLine();
        }

    }

    private static void printNumbersSmallerThanNumFromConsole(List<Integer> numberList, String[] commandAndNum) {
        if (commandAndNum[0].equals("Filter")) {
            String conditions = commandAndNum[1];
            int number = Integer.parseInt(commandAndNum[2]);

            switch (conditions) {
                case "<":
                    for (int i = 0; i < numberList.size(); i++) {
                        if (numberList.get(i) < number) {
                            System.out.print(numberList.get(i) + " ");
                        }
                    }
                    break;
                case ">":
                    for (int i = 0; i < numberList.size(); i++) {
                        if (numberList.get(i) > number) {
                            System.out.print(numberList.get(i) + " ");
                        }
                    }
                    break;
                case ">=":
                    for (int i = 0; i < numberList.size(); i++) {
                        if (numberList.get(i) >= number) {
                            System.out.print(numberList.get(i) + " ");
                        }
                    }
                    break;
                case "<=":
                    for (int i = 0; i < numberList.size(); i++) {
                        if (numberList.get(i) <= number) {
                            System.out.print(numberList.get(i) + " ");
                        }
                    }
                    break;
            }
            System.out.println();
        }
    }


    public static void printSumOfAllNumbers(List<Integer> numberList, String command) {
        if (command.equals("Get sum")) {
            int sum = 0;
            for (int i = 0; i < numberList.size(); i++) {
                sum += numberList.get(i);
            }
            System.out.println();
            System.out.println(sum);
        }
    }

    public static void printOddNumbers(List<Integer> numberList, String command) {
        if (command.equals("Print odd")) {

            for (int i = 0; i < numberList.size(); i++) {
                if (numberList.get(i) % 2 == 1) {
                    System.out.print(numberList.get(i) + " ");
                }
            }
        }
    }

    public static void printEvenNumbers(List<Integer> numberList, String command) {
        if (command.equals("Print even")) {

            for (int i = 0; i < numberList.size(); i++) {
                if (numberList.get(i) % 2 == 0) {
                    System.out.print(numberList.get(i) + " ");

                }
            }
            System.out.println();
        }
    }

    public static void ContainsYesOrNo(List<Integer> numberList, String[] commandAndNum) {
        if (commandAndNum[0].equals("Contains")) {
            int number = Integer.parseInt(commandAndNum[1]);
            if (numberList.contains(number)) {
                System.out.println("Yes");
            } else {
                System.out.println("No such number");
            }

        }
    }
}