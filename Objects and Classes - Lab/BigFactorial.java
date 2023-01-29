import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // създаваме BigInteger за да може да прочетем голямо число, след го преобразуваме
        // в String.valueOf(текста от който искаме да започнем.
        BigInteger bigResult = new BigInteger(String.valueOf(1));
        for (int index = 1; index <= n ; index++) {

            // Когато използаме multiply класът за да преобразуваме текста в цяло число
            // BigInteger.valueOf(числото)
            bigResult = bigResult.multiply(BigInteger.valueOf(index));
        }
        System.out.println(bigResult);
    }
}
