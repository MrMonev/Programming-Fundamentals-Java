import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfTown = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        short area = Short.parseShort(scanner.nextLine());

        String result = String.format
                ("Town %s has population of %d and area %d square km."
                        ,nameOfTown,population,area);
        System.out.println(result);
    }
}
