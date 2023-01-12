import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstNum = Integer.parseInt(scanner.nextLine());
        String symbols = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = calculations(firstNum,symbols,secondNum);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.printf(df.format(result));
    }
    private static double calculations(int firstNum, String symbols, int secondNum) {
        double result = 0;
        switch (symbols){
            case "-":
                 result = firstNum - secondNum;
                break;
            case "+":
                 result = firstNum + secondNum;
                break;
            case "/":
                result =(double) firstNum /(double) secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
        }

        return result;

    }
}
