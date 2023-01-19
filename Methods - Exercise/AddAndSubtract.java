import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        // (first + second) - third

        int sumOfNumbers = getSum(firstNum,secondNum);
        int subtractOfNumbers = subtract(sumOfNumbers, thirdNum);

        System.out.println(subtractOfNumbers);


    }
    public static int getSum (int first, int second) {
       return first + second;
    }
    public static int subtract (int first, int second){
        return first - second;
    }
}
