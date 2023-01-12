import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        // first line is how many names redding form consoles
        // Then we create int[] to save these names by Int.length - if are 4 - 4 lines with numbers
        int[] numbers = new int[number];

        // for loop for every name
        for (int i = 0; i < number; i++) {

            // first name
            String input = scanner.nextLine();
            int inputLength = input.length();
            // we convert the name.length  to an integer
            int sum = 0;

            // Every single symbol depending on (vowel or consonant)
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);

                // checking the symbols
                switch (currentChar){
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                    case 'A': case 'E': case 'I': case 'O': case 'U':
                        sum += currentChar * inputLength;
                        break;
                    default:
                        sum += currentChar / inputLength;
                        break;
                }
            }
            // when we finish with the first name - save the number of Index 0 to
            // int numbers[i] and continue to the end of our names.
            numbers[i] = sum;
        }
        // Sort the number sequence in ascending.
        Arrays.sort(numbers);
        for (int print : numbers) {
            System.out.println(print);
        }
    }
}

