import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int startYield = Integer.parseInt(scanner.nextLine());


        int resultFromFirstDay = 0;
        int totalResult = 0;
        int days = 0;

            while (startYield >= 100)
            {
                days++;
                resultFromFirstDay = startYield - 26;
                totalResult += resultFromFirstDay;
                startYield -= 10;
            }
        if (totalResult >= 100 || days != 0) {
            totalResult -= 26;
        }
        System.out.println(days);
        System.out.println(totalResult);


    }
    }

