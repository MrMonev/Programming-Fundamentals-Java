import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] number = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt)
                .toArray();


        int counter = 1;
        int maxCount = 0;
        int firstNum = 0;

        for (int i = 1; i < number.length; i++) {
            if (number[i] == number[i - 1]) {
                counter++;

                if (counter > maxCount){
                    maxCount = counter;
                    firstNum = number[i];
                }
            }else
                counter = 1;
            }

            for (int j = 0; j < maxCount; j++) {
                System.out.print(firstNum + " ");
            }
        }
    }
