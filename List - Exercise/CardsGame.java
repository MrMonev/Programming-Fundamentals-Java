import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First Hand
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        // Second Hand
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // We need to find the winning deck and, respectively, the winner.
        // Играта на бългаски ( БОЙ ), трябва да намерим кой е победителя в играта!

                                        // Правила за играта:

        // 1. Започваме от началото на първите карти.
        // 2. Сравняваме картите от първата ръка на тези от втората ръка.
        // 3. Играча който има по висока карта на полето за игра взима 2-те карти и ги слага най отдолу като последни!
        // 4. Преди да вземем картите, на втория играч картата трябва да е последна а на първият играч предпоследна
        // 5. Играча с по малко карти, трябва да премахва всяка карта от своята ръка.
        // 6. Ако играчите имат една и съща стойност на картите, никой не печели. И картите трябва да се премахнат от полето.
        // 7. Играта свършва когато на един от играчите му свършат картите.
        // 8. Трябва да принтираме победителя, и сумата на останалите карти.
        // 9. "{First/Second} player wins! Sum: {sum}".

        while (firstPlayer.size() > 0 && secondPlayer.size() > 0) {

            int player1Card = firstPlayer.remove(0);
            int player2Card = secondPlayer.remove(0);

            if (player1Card > player2Card) {
                firstPlayer.add(player1Card);
                firstPlayer.add(player2Card);

            } else if (player2Card > player1Card) {
                secondPlayer.add(player2Card);
                secondPlayer.add(player1Card);
            }
        }
        int sum = 0;
        if (firstPlayer.size() == 0) {
            for (Integer card : secondPlayer) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (Integer card : firstPlayer) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
