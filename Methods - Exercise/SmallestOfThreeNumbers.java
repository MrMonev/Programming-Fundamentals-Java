import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSmallNumber = Integer.parseInt(scanner.nextLine());
        int secondSmallNumber = Integer.parseInt(scanner.nextLine());
        int thirdSmallNumber = Integer.parseInt(scanner.nextLine());


        printSmallNumber(firstSmallNumber,secondSmallNumber,thirdSmallNumber);
    }
    public static void printSmallNumber (int first, int second, int third) {

        if (first <= second && first <= third) {
            System.out.printf("%d%n", first);
        } else if (second <= first && second <= third) {
            System.out.printf("%d%n", second);
        } else {
            System.out.printf("%d%n", third);
        }
    }
}
