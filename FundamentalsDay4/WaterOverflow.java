import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalLiters = 255;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int litersOfWater = Integer.parseInt(scanner.nextLine());
            sum += litersOfWater;
            if (totalLiters < sum) {
                sum -= litersOfWater;
            } else {
                continue;
            }
            System.out.println("Insufficient capacity!");

        }
        System.out.printf("%d", sum);
        
    }
}
//        5
//        20
//        100
//        100
//        100
//        20
//        7
//        10
//        20
//        30
//        10
//        5
//        10
//        20
