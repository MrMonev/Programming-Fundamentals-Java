import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Входни данни - 2 цели числа
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        // Да намерим фактуриела на първото число (numberOne) ако е голямо числото LONG
        long fact1 = calculateFact(numberOne);
        // Да намерим фактуриела на второто число (numberTwo) ако е голямо числото LONG
        long fact2 = calculateFact(numberTwo);
        // Трябва да раздемил фактуриела на 1то / на 2то, трябва да е дробно число (/)
        double divisionResult = fact1 * 1.0 / fact2; // Когато имам две целучислени числоа
        // и трябва да ги разделим умножаваме по 1.0
        System.out.printf("%.2f",divisionResult);
    }
    // метод, който намира факториела (long) на дадено число и ми го връща
    public static long calculateFact (int number) {
        // 5! = 1*2*3*4*5 = 120
        long fact = 1; // стойността на факториела (ще очаства в някакви умножения за това започваме от 1)
        for (int i = 1; i <= number ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
