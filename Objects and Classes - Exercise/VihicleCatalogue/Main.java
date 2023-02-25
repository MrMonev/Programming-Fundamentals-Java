package VihicleCatalogue;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> vehiclesList = new ArrayList<>();

        while (!input.equals("End")) {

            String[] command = input.split("\\s+");

            String type = command[0];
            String model = command[1];
            String color = command[2];
            int horsePower = Integer.parseInt(command[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehiclesList.add(vehicle);


            input = scanner.nextLine();
        }

        String enterModel = scanner.nextLine();
        while (!enterModel.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehiclesList) {
                if (enterModel.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                    break;
                }
            }
            enterModel = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageHP(vehiclesList, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.", getAverageHP(vehiclesList, "trucks"));

    }

    private static double getAverageHP(List<Vehicle> vehicleList, String type) {
        double sum = 0;
        int count = 0;
        if (type.equals("cars")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getHorsePower();
                    count++;
                }
            }
        } else if (type.equals("trucks")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getHorsePower();
                    count++;
                }
            }
        }
        if (sum == 0) {
            return 0;
        }
        return sum / count;
    }
}
