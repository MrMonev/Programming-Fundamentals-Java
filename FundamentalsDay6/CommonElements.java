import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");


        for (String elementOfSecondArr : secondArr ) {
            // блок от код, който искаме да повторим за всеки един елемент
            for (String elementFirstArr : firstArr) {
                if (elementOfSecondArr.equals(elementFirstArr)) {
                    System.out.print(elementFirstArr + " ");
                    break;
                }
            }
        }

    }
}
