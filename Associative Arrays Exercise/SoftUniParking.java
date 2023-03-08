import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static <Map> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        LinkedHashMap<String, String> register = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] commandArr = input.split("\\s+");

            for (int index = 0; index < input.length(); index++) {
                String command = commandArr[0];
                String userName = commandArr[1];

                // {username} {licensePlateNumber}
                if (command.equals("register")) {
                    String plateNumber = commandArr[2];
                    if (!register.containsKey(userName)) {

                        register.put(userName, plateNumber);
                        System.out.printf("%s registered %s successfully%n", userName, plateNumber);
                        break;
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                        break;
                    }
                    // {username}
                } else if (command.equals("unregister")) {
                    if (!register.containsKey(userName)) {
                        System.out.printf("ERROR: user %s not found%n", userName);
                        break;
                    } else {
                        register.remove(userName);
                        System.out.printf("%s unregistered successfully%n", userName);
                        break;
                    }
                }
            }
        }
        for (java.util.Map.Entry<String, String> entry : register.entrySet()) {
            String key = entry.getKey();
            String value = String.valueOf(entry.getValue());
            System.out.printf("%s => %s%n", key, value);
        }
    }
}
