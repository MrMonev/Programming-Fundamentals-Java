import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] peopleInWagon = new int[wagons];
        int sum = 0;
        for (int i = 0; i < wagons; i++) {

            peopleInWagon[i] = Integer.parseInt(scanner.nextLine());
            System.out.print(peopleInWagon[i] + " ");

            sum += peopleInWagon[i];
        }
        System.out.printf("%n%d",sum);
    }
}
