import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int howMany = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= howMany; i++) {
              int totalSum = i;
              int sum = 0;

            while (totalSum > 0) {
                sum += (totalSum % 10);
                totalSum = totalSum / 10;

            }
            if (sum == 5 || sum == 7  || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }

    }
}
