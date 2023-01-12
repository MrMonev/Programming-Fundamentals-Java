import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String games = scanner.nextLine();

        double currentBalance  = Double.parseDouble(games);
        double totalPrice = currentBalance ;
        double totalSpend = 0;
        double price = 0;

         while (true) {

            if (currentBalance  == 0) {

                System.out.println("Out of money!");
                break;
            }

            games = scanner.nextLine();

            if("Game time".equalsIgnoreCase(games)) {
                break;
            }

            switch (games) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            if (currentBalance  >= price && price > 0) {

                totalSpend += price;
                currentBalance  -= price;
                System.out.printf("Bought %s%n", games);

            }else if (currentBalance  < price && price > 0) {

                System.out.println("Too Expensive");
            }

            price = 0;

        }

        if (currentBalance  > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, (totalPrice - totalSpend));
        }



    }
}