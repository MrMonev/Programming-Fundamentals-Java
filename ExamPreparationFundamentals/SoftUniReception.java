import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ефективност на всеки един работник
        int firstEmployEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployEfficiency = Integer.parseInt(scanner.nextLine());

        // Общт брой на студентите
        int countStudents = Integer.parseInt(scanner.nextLine());

        int hoursCount = 0;
        int totalEfficiency = firstEmployEfficiency + secondEmployEfficiency + thirdEmployEfficiency;

        if (countStudents % totalEfficiency == 0) {
            hoursCount = countStudents / totalEfficiency;
        } else if (countStudents % totalEfficiency != 0) {
            hoursCount = countStudents / totalEfficiency + 1;
        }

        if (countStudents > 3 && hoursCount % 3 == 0) {
            hoursCount += hoursCount / 3 -1;
        } else if (hoursCount > 3) {
            hoursCount += hoursCount / 3;
        }
        System.out.printf("Time needed: %dh.",hoursCount);
    }
}
