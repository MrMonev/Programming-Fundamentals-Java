import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n ; number++) {
            // проверка дали е топ Число
            // 1. сумата от цифрите да се дели на 8 - цялата логика е в първи метод!
            // 2. съдържа поне една нечетна цигра - цялата локиа е във втория метод!
            if (isSumOfDigDivisibleBy8(number) && isContainsOddDig(number)) {
                System.out.println(number);
            }
        }
    }
    // метод, който проверява дали сумата от цифрите се дели на 8
    // true -> ако сумата се дели на 8
    // false -> ако сумата не се дели на 8
    public static boolean isSumOfDigDivisibleBy8 (int number){
        //1. сума от цифрите
        int sumDigits = 0;
        while (number > 0) {
            // взимаме последната цифра (number % 10)
            int lastDig = number % 10;
            // сумираме последната цифра
            sumDigits += lastDig;
            // премахваме последната цифра от числото (number / 10)
            number /= 10;
        }
        //2. проверка на сумата за делиние със 8
        return sumDigits % 8 == 0; // щом имаме == това е булев израз (true or false)
        // ако ни върне 0 - true
        // ако върне различно от 0 - false
    }
    // Метод, който проверява дали имаме поне една нечетна цигра в числото
    // true -> имам поне една нечетна цифра
    // false -> ако нямам нито една нечетна цифра
    public static boolean isContainsOddDig (int number) {
        // да обходя всяка цифра във числото -> проверка дали е нечестна
        while (number > 0) {
            // взиамме последната цифра
            int lastDig = number % 10;
            // проверяваме дали е нечетна
            if (lastDig % 2 != 0) {
                return true;
            } else {
                // цифрата да е четна -> премахваме
                number = number / 10;
            }
        }
        // Взели всички цифри и никоя не е била нечетна
        return false;
    }
}
