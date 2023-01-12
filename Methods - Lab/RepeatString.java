import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String resultTex = String.valueOf(repeatNTimes(n, inputText));
        System.out.println(resultTex);

    }
    public static StringBuilder repeatNTimes(int n, String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            result = new StringBuilder(result + text);
        }
        return result;
    }
}
