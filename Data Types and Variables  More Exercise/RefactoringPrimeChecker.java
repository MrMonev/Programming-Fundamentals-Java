import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int primeNumbers = Integer.parseInt(scanner.nextLine());
        for (int firstNum = 2; firstNum <= primeNumbers; firstNum++) {
            boolean itIsPrime = true;
            for (int secondNum = 2; secondNum < firstNum; secondNum++) {
                if (firstNum % secondNum == 0) {
                    itIsPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", firstNum, itIsPrime);
        }

    }
}
