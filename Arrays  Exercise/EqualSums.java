import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray()).toArray();



        for (int i = 0; i < numbers.length; i++) {

        int leftSum = 0;
        int rightSum = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (j < i) {
                    leftSum += numbers[j];
                } else if (j > i) {
                    rightSum += numbers[j];
                }
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }
        }
            System.out.println("no");
        }
    }

