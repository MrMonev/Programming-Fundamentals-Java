import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        StringBuilder builder = new StringBuilder(inputText);

        for (int index = 0; index <= builder.length() - 1 ; index++) {

            if(builder.charAt(index) == builder.charAt(index + 1)) {
                builder.deleteCharAt(index + 1);
                index--;
            }
        }

        System.out.println(builder);

    }
}
