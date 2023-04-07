import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Имаме първоначен health 100 и Bitcoins 0


        // Ще ни се подава String, който ще е всяка стая (dungeon room)
        // Всяка стая ще бъде разделена със символа ( | ) "room1|room2|room3"

        String[] dungeonRooms = scanner.nextLine().split("\\|+");

        int health = 100;
        int amountOfBitcoins = 0;
        int room = 0;

        boolean madeIt = true;

        for (int index = 0; index < dungeonRooms.length; index++) {
            String[] firstRoom = dungeonRooms[index].split("\\s+");
            String monsterAttack = firstRoom[0];
            int healthNumber = Integer.parseInt(firstRoom[1]);
            room++;

            if (monsterAttack.equalsIgnoreCase("potion")) {
                int currentHealth = health;
                health += healthNumber;
                if (health > 100) {
                    health = 100;
                    int amount = 100 - currentHealth;
                    System.out.printf("You healed for %d hp.%n", amount);
                } else {
                    System.out.printf("You healed for %d hp.%n", healthNumber);
                }
                System.out.printf("Current health: %d hp.%n", health);
            } else if (monsterAttack.equalsIgnoreCase("chest")) {
                amountOfBitcoins += healthNumber;
                System.out.printf("You found %d bitcoins.%n", healthNumber);

            } else {
                health -= healthNumber;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", monsterAttack);
                } else {
                    System.out.printf("You died! Killed by %s.%n", monsterAttack);
                    System.out.printf("Best room: %d", room);
                    madeIt = false;
                    break;
                }
            }
        }
        if (madeIt) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", amountOfBitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }


}
