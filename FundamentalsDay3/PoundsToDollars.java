import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


      float britishPound = Float.parseFloat(scanner.nextLine());

       float dollars = britishPound * 1.36f;

        System.out.printf("%.3f",dollars);
    }
}
