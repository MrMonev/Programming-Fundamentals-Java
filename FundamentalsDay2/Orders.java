import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalSum;
        double totalCount = 0.0;

        for (int i = 0; i < n ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysPerMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCunt = Integer.parseInt(scanner.nextLine());

            totalSum = ((daysPerMonth * capsulesCunt) * pricePerCapsule);
            totalCount += totalSum;

            System.out.printf("The price for the coffee is: $%.2f%n", totalSum);

        }

        System.out.printf("Total: $%.2f", totalCount);
    }
}
