import java.util.*;

public class SumOfOddNumbers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;


        for (int i = 0; i <= n * 2; i++) {

                if (i % 2 == 0) {
                  continue;
                } else {
                    sum += i;
                }

            System.out.printf("%d%n", i);
            }

        System.out.printf("Sum: %d", sum);
        }

    }

