import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("swap")) {

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = number[index1];
                int element2 = number[index2];

                number[index1] = element2;
                number[index2] = element1;

            } else if (command.contains("multiply")) {

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = number[index1];
                int element2 = number[index2];

                int product = element1 * element2;
                number[index1] = product;


            } else if (command.equals("decrease")) {

                for (int index = 0; index <= number.length - 1; index++) {
                    number[index]--;
                    //  number[index] = number[index] - 1;
                    // number[index] -= 1;
                }
            }
            command = scanner.nextLine();
        }
        for (int index = 0; index <= number.length - 1; index++) {
            int currentNum = number[index];
            if (index != number.length - 1) {
                System.out.print(currentNum + ", ");
            } else {
                System.out.println(currentNum);
            }

        }
    }
}
