import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Съхраняваме:
        // Shards -> Количество
        // Fragments -> Количество
        // Motes -> Количество

        // запис: материал - > количество
        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        // запис: боклук -> количество
        Map<String, Integer> junks = new LinkedHashMap<>();// Боклуци


        boolean isWin = false;
        // true -> ако сме спечелили
        // false -> ако не сме спечелили


        // Строп: ако спечелим
        // Продължаваме: ако не сме спечелили
        while (!isWin) {
            String input = scanner.nextLine();
            // input = 6 leathers 255 fragments 7 Shards
            String[] inputData = input.split("\\s+");

            for (int index = 0; index <= inputData.length - 1; index += 2) {
                int quantity = Integer.parseInt(inputData[index]); // количество
                String material = inputData[index + 1].toLowerCase(Locale.ROOT); // Вид на събрания материал

                // проверка какъв материал сме събрали -> събираме съотвения материал
                if(material.equals("shards") ||
                        material.equals("fragments") ||
                                material.equals("motes")) {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);
                } else {
                    // Материалът е боклук
                    if (!junks.containsKey(material)) {
                        junks.put(material,quantity);
                    } else {
                        int currentQuantity = junks.get(material);
                        junks.put(material, currentQuantity + quantity);
                    }
                }
                // проверка, дали сме спечелили легендарния предмет
                if(materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }
        //Всички валидни материали -> materials
        // entry: материал (key) : количество (value)
        materials.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        // Всички боклуци -> junks
        // entry: материал(key): количество (value)
       junks.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
