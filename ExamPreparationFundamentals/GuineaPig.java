import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodQuantityKg = Double.parseDouble(scanner.nextLine());
        double hayQuantityKg = Double.parseDouble(scanner.nextLine());
        double coverQuantityKg = Double.parseDouble(scanner.nextLine());
        double guineasWeightKg = Double.parseDouble(scanner.nextLine());

        double foodQuantityGrams = foodQuantityKg * 1000;
        double hayQuantityGrams = hayQuantityKg * 1000;
        double coverQuantityGrams = coverQuantityKg * 1000;
        double guineasWeightGrams = guineasWeightKg * 1000;

        boolean isNotEnough = false;

        for (int day = 1; day <= 30; day++) {
            foodQuantityGrams = foodQuantityGrams - 300;
            if (day % 2 == 0) {
                double currentHay = foodQuantityGrams * 0.05;
                hayQuantityGrams = hayQuantityGrams - currentHay;
            }
            if (day % 3 == 0) {
                double currentCover = guineasWeightGrams / 3;
                coverQuantityGrams = coverQuantityGrams - currentCover;
            }
            if (foodQuantityGrams <= 0 || hayQuantityGrams <= 0 || coverQuantityGrams <= 0) {
             isNotEnough = true;
             break;
            }
        }
        if (isNotEnough) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    foodQuantityGrams / 1000, hayQuantityGrams / 1000, coverQuantityGrams / 1000);
        }
    }
}
