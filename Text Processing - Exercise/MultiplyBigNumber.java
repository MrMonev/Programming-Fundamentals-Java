import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNum = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        StringBuilder stringBuilder = new StringBuilder();


        int remain = 0;

        for (int i = firstNum.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(firstNum.substring(i, i + 1));
            int current = digit * secondNum;
            current += remain;
            stringBuilder.append((current % 10));
            remain = current / 10;
        }
        if (remain != 0) {
            stringBuilder.append(remain);
        }
        boolean zero = true;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (Integer.parseInt(stringBuilder.substring(i, i + 1)) != 0) {
                zero = false;
            }
        }
        if (zero) {
            System.out.println(0);
        } else {
            StringBuilder output = new StringBuilder();
            boolean trailing = true;
            for (int i = stringBuilder.length() - 1; i >= 0; i--) {
                if (Integer.parseInt(stringBuilder.substring(i, i + 1)) == 0 && trailing) {

                } else {
                    trailing = false;
                    output.append(stringBuilder.charAt(i));
                }
            }
            System.out.println(output.toString());
        }

    }
}
