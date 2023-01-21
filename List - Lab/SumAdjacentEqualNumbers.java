import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Double> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numList.size(); i++) {
            if (i == numList.size() - 1) {
                break;
            }
            double currentNum = numList.get(i);
            double nextNum = numList.get(i + 1);
            if (currentNum == nextNum) {
                numList.set(i, currentNum + nextNum);
                numList.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinItemsByDelimiter(numList, " "));

    }
    public static String joinItemsByDelimiter(List<Double> list, String delimiter){
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item: list)  {
          String numberDecimalFormat = df.format(item) + delimiter;
          result += numberDecimalFormat;
        }
        return result;
    }
}
