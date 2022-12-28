import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double totalCoin = 0.0;


        while (!command.equals("Start")) {
            double nextCoin = Double.parseDouble(command);

            if (nextCoin != 0.1 && nextCoin != 0.2 && nextCoin != 0.5
                    && nextCoin != 1.0 && nextCoin != 2.0) {
                System.out.printf("Cannot accept %.2f%n", nextCoin);
            } else {
                totalCoin += nextCoin;
            }
            command = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {

            boolean hasMoney = true;

            switch (product) {
                case "Coke":
                    if (totalCoin < 1) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalCoin -= 1;
                    }
                    break;
                case "Soda":
                    if (totalCoin < 0.8) {
                        System.out.println("Sorry not enough money");
                        hasMoney = false;
                    } else {
                        totalCoin -= 0.8;
                    }
                    break;

                case "Crisps":
                    if (totalCoin < 1.5) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    }else {
                        totalCoin -= 1.5;
                    }
                    break;
                case "Water":
                    if (totalCoin < 0.7) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalCoin -= 0.7;
                    }
                    break;

                case "Nuts":
                    if (totalCoin < 2) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalCoin -= 2;
                    }
                    break;

                default:
                    System.out.println("Invalid product");
                    hasMoney = false;
                    break;
            }
            if (!hasMoney) {
                product = scanner.nextLine();
                continue;
            }
            System.out.printf("Purchased %s%n", product);

            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n",totalCoin);
    }
}