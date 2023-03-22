import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> furniture = new ArrayList<>(); // списък с мебели
        double totalSum = 0; // общшо изхарчената сума

        String input = scanner.nextLine();

        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("Purchase")) {
            // input = ">>Sofa<<312.23!3"
            
            Matcher matcher = pattern.matcher(input);
            //matcher = ">>{furniture name}<<{price}!{quantity}"

            // find ->  true -> input отговаря на regex;
            // find -> false -> input не отговаря;

            // input отговаря на нашия regex;
            if(matcher.find()) {

                // купуваме мебели

                String furnitureName = matcher.group("furnitureName");// мебел
                double price = Double.parseDouble(matcher.group("price"));// цена
                int quantity = Integer.parseInt(matcher.group("quantity"));// количество

                furniture.add(furnitureName);
                double currentFurniturePrice = quantity * price; // какво сме платили за въпросната мебел
                totalSum += currentFurniturePrice;

            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);

        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
