import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] fruitsArr = Arrays.stream(scanner.nextLine().split(" "))
                .filter(f -> f.length() % 2 == 0) // ако израза ми е верен ще се запази в fruitsArr
                .toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(),fruitsArr));

    }
}

