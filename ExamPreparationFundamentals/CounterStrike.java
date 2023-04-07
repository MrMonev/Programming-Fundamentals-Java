import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentEnergy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        boolean enoughEnergy = true;
        int countBattle = 0;

        while (!"End of battle".equals(input)) {
            int distance = Integer.parseInt(input);

            if ((currentEnergy - distance) < 0) {
                enoughEnergy = false;
                break;
            } else {
                currentEnergy -= distance;
                countBattle++;

                if (countBattle % 3 == 0){
                    currentEnergy += countBattle;
                }
            }


            input = scanner.nextLine();

        }
        if(enoughEnergy) {
            System.out.printf("Won battles: %d. Energy left: %d%n",countBattle, currentEnergy);
        } else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",countBattle,currentEnergy);
        }
    }
}
