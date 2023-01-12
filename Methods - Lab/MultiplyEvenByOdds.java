import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numbers = Integer.parseInt(scanner.nextLine());
        if (numbers < 0) {
            numbers = numbers * (-1);
        }
        int multiple = multiplyOddAndEven(numbers);
        System.out.println(multiple);
            }
            public static int multiplyOddAndEven(int numbers) {
        int evenSum = getSumOfEven(numbers);
        int oddSum = getSumOfOdd(numbers);
        return evenSum * oddSum;
            }
            public static int getSumOfEven(int numbers) {
                int evenSum = 0;
                while (numbers != 0) {
                    int sum = numbers % 10;
                    if (sum % 2 == 0) {
                        evenSum += sum;
                    }
                    numbers /= 10;

                }
                return evenSum;

                }
    public static int getSumOfOdd (int numbers) {
        int oddSum = 0;
        while (numbers != 0) {
            int sum = numbers % 10;
            if (sum % 2 == 1) {
                oddSum += sum;
            }
            numbers /= 10;
        }
        return oddSum;
    }
            }







