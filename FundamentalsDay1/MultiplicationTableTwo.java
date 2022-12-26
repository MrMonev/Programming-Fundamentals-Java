import java.util.Scanner;

public class MultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int times = 1;
        while (times <= 10) {

            int product = number * times;


            System.out.printf("%d X %d = %d%n", number, times, product);

            times++;

        }
    }
}


