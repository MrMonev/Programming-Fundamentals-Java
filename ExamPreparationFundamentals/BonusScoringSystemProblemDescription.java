
import java.util.Scanner;

public class BonusScoringSystemProblemDescription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Условие, калколира бонут точките за всеки студент в курса


        // 1. Първото нещо което ще тряба е да намеря е колко са студентите?
        int studentsNum = Integer.parseInt(scanner.nextLine()); // 5

        // 2. Вторто нещо е общия брой на лекторите в курса?
        int lecturesNum = Integer.parseInt(scanner.nextLine());// 25

        // 3. Третото нещо е получаваме допълнителен бонус?
        int bonusNUm = Integer.parseInt(scanner.nextLine()); // 30

        double maxBonus = 0;
        int maxAttendances = 0;

        // { total bonus } = {student attendances } / {course lectures } * (5 + {additional bonus})
        for (int i = 0; i < studentsNum; i++) {
            // 4. Броя на посещения на всеки студент
            int studentAttendances = Integer.parseInt(scanner.nextLine());


            double totalBonus = ((1.0 * studentAttendances) / lecturesNum * (5 + bonusNUm));
            // 12 / 25 * ( 5 + 30) = 16.8


            if (maxBonus <= totalBonus) {
                maxBonus = totalBonus;
                maxAttendances = studentAttendances;
                // 6. Да намерим студента с максималния бонус и да го принтираме
                //    заедно с присъствието му в следния формат:
                //    "Max Bonus: { Max bonus points}."
                //    "The student has attended {student attendances} lectures."
            }
        }

            // 7. Трябва да закръгля бонус точките в края до най-близкото по-голямо число.
            System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
            System.out.printf("The student has attended %d lectures.", maxAttendances);

    }
}