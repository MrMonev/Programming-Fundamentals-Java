import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int fourthNum = Integer.parseInt(scanner.nextLine());


        int totalSumFromFirstAndSecond = firstNum + secondNum;
        double totalResult = totalSumFromFirstAndSecond /(double) thirdNum;

        int finalSum = (int)totalResult * fourthNum;

        System.out.println(finalSum);
    }
}
