import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> specialNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).
                collect(Collectors.toList());

       String[] numbersArray = scanner.nextLine().split("\\s+");

       int bombNumber = Integer.parseInt(numbersArray[0]);
       int bombPower = Integer.parseInt(numbersArray[1]);

       int sum = 0;

       while (specialNumbers.contains(bombNumber)) {
           int index = specialNumbers.indexOf(bombNumber);

           int left = Math.max(0, index - bombPower);
           int right = Math.min(specialNumbers.size() - 1, index + bombPower);

           for (int i = right; i >= left ; i--) {
               specialNumbers.remove(i); // index Or Object
           }
       }
        for (int i = 0; i < specialNumbers.size() ; i++) {
            sum += specialNumbers.get(i);
        }
        System.out.println(sum);

    }
}
