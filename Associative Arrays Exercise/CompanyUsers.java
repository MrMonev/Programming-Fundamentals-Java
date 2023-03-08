import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> informationCompany = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+->");
            String companyName = data[0];
            String employeeId = data[1];
            if (!informationCompany.containsKey(companyName)) {
                informationCompany.put(companyName, new ArrayList<>());
            }
            if (informationCompany.containsKey(companyName) && !informationCompany.get(companyName).contains(employeeId))
                informationCompany.get(companyName).add(employeeId);

            input = scanner.nextLine();
        }
        informationCompany.entrySet().forEach(entry -> {
            System.out.printf("%s%n", entry.getKey());
            entry.getValue().forEach(employed -> System.out.printf("--%s%n", entry.getValue().
                    get(entry.getValue().indexOf(employed))));
        });

    }
}
