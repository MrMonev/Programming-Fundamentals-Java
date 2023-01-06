import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] numbers = scanner.nextLine().split(" ");
        int[] totalNums = new int[numbers.length];

        boolean itIsEqual = false;
        int divider = 0;

        for (int i = 0; i < numbers.length; i++) {
            totalNums[i] = Integer.parseInt(numbers[i]);

        }
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < i; j++) {
                leftSum += totalNums[j];
            }
            for (int k = i + 1; k < numbers.length; k++) {
                rightSum += totalNums[k];
            }
            if (leftSum == rightSum) {
                itIsEqual = true;
                divider = i;
                break;
            }
        }
        if (itIsEqual) {
            System.out.println(divider);
        } else {
            System.out.println("no");
        }
    }
}
