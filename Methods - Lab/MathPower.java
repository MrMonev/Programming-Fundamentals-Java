import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numInput = Double.parseDouble(scanner.nextLine());
        double powerInput = Double.parseDouble(scanner.nextLine());

        double result = mathPower(numInput,powerInput);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));


    }
    public static double mathPower(double num, double power) {
        double totalResult = 1;
        for (int i = 1; i <= power ; i++) {
            totalResult = totalResult * num;
        }
        return totalResult;
    }
}
