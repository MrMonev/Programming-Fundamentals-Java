import java.util.Scanner;

public class ZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rows = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[rows];
        String[] secondArray = new String[rows];

        for (int row = 1; row <= rows; row++) {
            String[] numbers = scanner.nextLine().split(" ");
            String firstNumber = numbers[0];
            String secondNumber = numbers[1];

            if (row % 2 == 0) {
                secondArray[row - 1] = firstNumber;
                firstArray [row- 1] = secondNumber;

            } else {
                firstArray[row - 1] = firstNumber;
                secondArray [row - 1] = secondNumber;
            }
        }
        // Когато искаме да отпечатаме масив:
        // 1. for по index
        // 2. foreach по елементите
        // 3. String.join !!!! само за масив от текстове !!
        //String.join - взима всеки елемент и ги прави едно цяло, като между тях има разтояните " ".
        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));


    }
}
