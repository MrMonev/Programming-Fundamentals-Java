import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] randomArr = input.split("\\s+");
        Random random = new Random();

        for (int i = 0; i < randomArr.length ; i++) {
            int indexX = random.nextInt(randomArr.length );
            int indexY = random.nextInt(randomArr.length );

            String oldWordX = randomArr[indexX];
            randomArr[indexX] = randomArr[indexY];
            randomArr[indexY] = oldWordX;
        }
        System.out.println(String.join(System.lineSeparator(),randomArr));
    }
}
