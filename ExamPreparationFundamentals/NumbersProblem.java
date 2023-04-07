import java.util.*;
import java.util.stream.Collectors;


public class NumbersProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Трябва да напиша програма която чете поредица от числа!
        //  Намира и отпечатва първите 5 числа по големи от средната стойност в поредица
        // Сортирани в низходящ ред

        List<Integer> numbers = Arrays.stream(scanner.nextLine().
                        split(" ")).map(Integer::parseInt).
                sorted(Collections.reverseOrder()).toList();

        int average = 0;

        for (Integer currentNum : numbers) {
            average += currentNum;
        }


        double averageNum = average * 1.0 / numbers.size();

        List<Integer> result = new ArrayList<>();

        for (Integer currentNum : numbers) {
            if (currentNum > averageNum) {
                result.add(currentNum);
            }
        }
//        Collections.sort(result);
//        Collections.reverse(result);

        if (result.isEmpty()) {
            System.out.println("No");

        } else if (result.size() < 5) {

            for (Integer bigNum : result) {
                System.out.print(bigNum + " ");
            }
        } else {
            result = result.stream().limit(5).collect(Collectors.toList());
            for (Integer number : result) {
                System.out.print(number + " ");
            }
        }
    }
}
