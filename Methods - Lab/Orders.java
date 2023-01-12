import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int money = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (product) {

            case "coffee":
                price = money * 1.50;
                break;

            case "water":
                price = money * 1.00;
                break;

            case "coke":
                price = money * 1.40;
                break;

            case "snacks":
                price = money * 2.00;
                break;

        }
        System.out.printf("%.2f",price);
    }
}
