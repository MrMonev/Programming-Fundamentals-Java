import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        //запис: група(side) -> списък с user-и
        Map<String, List<String>> map = new LinkedHashMap<>();
        while (!command.equals("Lumpawaroo")) {

            //1.  Нямаме такава група
            if (command.contains(" | ")) {
                // command =  { force_side] | {force_user}
                String group = command.split("\\s+\\|\\s+")[0];
                String user = command.split("\\s+\\|\\s+")[1];

                //1. Дали имаме такава група
                if (!map.containsKey(group)) {
                    // група -> празен списък
                    map.put(group, new ArrayList<>());
                }
                //2. Имаме такава група -> добавме към групата user, ако го няма  в
                // НИКОЯ ГРУПА
                boolean isExistUser = false; // user го има в дадена група

                for (List<String> listUsers : map.values()){
                    if (listUsers.contains(user)) {
                        // USER  го има в някоя група
                        isExistUser = true;
                        break;
                    }
                }
                if(!isExistUser){
                    // USER го няма в никоя група
                    map.get(group).add(user);
                }

            }
            else if (command.contains(" -> ")) {
                // command =  {force_user} -> { force_side]
                String user = command.split("\\s+->\\s+")[0];
                String group = command.split("\\s+->\\s+")[1];
                // 1. Ако дадения user го има в дадена група - Премахваме го от текущата група
               // запис: Група(key) -> списък с users (Value)
                map.entrySet().forEach(entry -> entry.getValue().remove(user));

                //2. Проверяваме дали имаме такава група!
                if (map.containsKey(group)){
                    map.get(group).add(user);
                } else {
                    // нямаме такава група в колято иска да отиде, --> Създаваме групата!
                    map.put(group, new ArrayList<>());
                    map.get(group).add(user);
                }
                System.out.printf("%s joins the %s side!%n", user, group);
            }



            command = scanner.nextLine();
        }

        // записи: група -> списък с user-и
        //1. филтрирам записите -> бр. на хората е по голям от 0
        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0) // оставяме само записите които ни отговарят на условието
                .forEach(entry -> {
                    //entry: groupName(key) -> list of users(value)
                    //"Side": {forceSide}, Members: {forceUsers.Count}
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(),entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.println("! " + user));
        });
    }
}
