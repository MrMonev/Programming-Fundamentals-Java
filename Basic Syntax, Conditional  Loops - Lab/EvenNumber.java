import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int absoluteValue = Integer.parseInt(scanner.nextLine());

        if (absoluteValue % 2 == 0) {
            System.out.printf("The number is: %d", Math.abs(absoluteValue));
        } else {
            System.out.println("Please write an even number.");


            while (true) {
                int oddSum = Integer.parseInt(scanner.nextLine());

                if (oddSum % 2 == 0) {
                    System.out.printf("The number is: %s", Math.abs(oddSum));
                    break;

                } else {
                    System.out.println("Please write an even number.");
                }
            }

        }
    }
}
