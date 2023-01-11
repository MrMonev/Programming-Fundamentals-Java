import java.util.Scanner;
import java.util.function.DoublePredicate;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceForAsingleLightsabers = Double.parseDouble(scanner.nextLine());
        double priceForAsingleRobe = Double.parseDouble(scanner.nextLine());
        double priceForAsingleBelt = Double.parseDouble(scanner.nextLine());


        int neededSabers = countOfStudents+(int)Math.ceil((double)countOfStudents * 0.10);
        int freeBelts = countOfStudents / 6;

        double totalSum = priceForAsingleLightsabers
                * neededSabers + priceForAsingleRobe
                * countOfStudents + priceForAsingleBelt
                * (countOfStudents - freeBelts);

        if (totalSum <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalSum - amountOfMoney);
        }


        }
    }

