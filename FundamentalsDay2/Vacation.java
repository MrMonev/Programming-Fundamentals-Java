import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        String people = scan.nextLine();
        String day = scan.nextLine();

        double price = 0;
        if (day.equalsIgnoreCase("Friday") && people.equalsIgnoreCase("Students")){
            price = number * 8.45;
            if(number >= 30){
                price = price * 0.85;
            }

        }else if (day.equalsIgnoreCase("Friday") && people.equalsIgnoreCase("Business")){
            price = number * 10.90;
            if(number >= 100){
                price = price - (10 * 10.90);
            }

        }else if (day.equalsIgnoreCase("Friday") && people.equalsIgnoreCase("Regular")){
            price = number * 15;
            if(number >= 10 && number <= 20){
                price = price * 0.95;
            }

        }else if (day.equalsIgnoreCase("Saturday") && people.equalsIgnoreCase("Students")){
            price = number * 9.80;
            if(number >= 30){
                price = price * 0.85;
            }

        }else if (day.equalsIgnoreCase("Saturday") && people.equalsIgnoreCase("Business")){
            price = number * 15.60;
            if(number >= 100){
                price = price - (10 * 15.60);
            }

        }else if (day.equalsIgnoreCase("Saturday") && people.equalsIgnoreCase("Regular")){
            price = number * 20;
            if(number >= 10 && number <= 20){
                price = price * 0.95;
            }

        }else if (day.equalsIgnoreCase("Sunday") && people.equalsIgnoreCase("Students")){
            price = number * 10.46;
            if(number >= 30){
                price = price * 0.85;
            }

        }else if (day.equalsIgnoreCase("Sunday") && people.equalsIgnoreCase("Business")){
            price = number * 16;
            if(number >= 100){
                price = price - (10 * 16);
            }

        }else if (day.equalsIgnoreCase("Sunday") && people.equalsIgnoreCase("Regular")){
            price = number * 22.50;
            if(number >= 10 && number <= 20){
                price = price * 0.95;
            }

        }
        System.out.printf("Total price: %.2f", price);

    }
}