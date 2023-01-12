import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Трябва да напиша програмя която чете цели числа
        // Трябва да ги сложа във int[] да ги раздлея с разтояние .split
        // След това трябва да проверя всеки индекс дали е по голям от следващият!
        // Ще създам една булева която да ми държи стойността на по голямото число.
        // Като намеря кой е по голем той взаема неговото място
        // И принтирам на конзолата всеки индекс -
        // Като най големият трябва да е 0 индекс и така по големина

        int[] primeNumber = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();

        for (int firstNum = 0; firstNum < primeNumber.length; firstNum++) {

            boolean isBigger = true;

            for (int nextNum = firstNum + 1; nextNum < primeNumber.length; nextNum++) {

                if (primeNumber[firstNum] <= primeNumber[nextNum]) {
                    isBigger = false;
                }

            }
            if (isBigger) {
                System.out.print(primeNumber[firstNum] + " ");
            }

        }

    }
}
