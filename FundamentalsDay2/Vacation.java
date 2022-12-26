import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0.0;

        switch (typeOfPeople) {
            case "Students":
                if (dayOfWeek.equals("Friday")) {
                    price = 8.45;
                } else if (dayOfWeek.equals("Saturday")) {
                    price = 9.80;
                } else if (dayOfWeek.equals("Sunday")) {
                    price = 10.46;
                }
                price *= people;
                if (people >= 30) {
                    price *= 0.85;
                }

                break;
            case "Business":
                if (dayOfWeek.equals("Friday")) {
                    price = 10.90;
                } else if (dayOfWeek.equals("Saturday")) {
                    price = 15.60;
                } else if (dayOfWeek.equals("Sunday")) {
                    price = 16.0;
                }
                price *= people;
                if (people >= 100) {
                    price *= 0.90;
                }

                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")) {
                    price = 15.0;
                } else if (dayOfWeek.equals("Saturday")) {
                    price = 20.0;
                } else if (dayOfWeek.equals("Sunday")) {
                    price = 22.50;
                }
                price *= people;
                if ((people >= 10) && (people <= 20)) {
                    price *= 0.95;
                }
                break;

        }
        System.out.printf("Total price: %.2f", price);


    }
}
