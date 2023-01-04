import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double maxVolume = Double.MIN_VALUE;
        String maxModelKeg = "";


        int countKegs = Integer.parseInt(scanner.nextLine());
        for (int keg = 1; keg <= countKegs ; keg++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                maxModelKeg = kegModel;
            }
        }
        System.out.println(maxModelKeg);
    }
}
