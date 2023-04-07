import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int plundersPerDay = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunders = 0;
        for (int day = 1; day <= days; day++) {
            totalPlunders += plundersPerDay;
            if (day % 3 == 0) {
                double extraPlunders = 0.5 * plundersPerDay; //+50%
                totalPlunders += extraPlunders;
            }

            if (day % 5 == 0) {
                totalPlunders *= 0.7; // -30%
            }

        }
        if (totalPlunders >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.",totalPlunders);
        } else {
            // Намираме колко процента ни остават нашите Кражби
            double percent = (totalPlunders / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.",percent);
        }
    }
}
