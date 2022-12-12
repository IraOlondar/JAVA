package seminar5;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class homeWorkApp2 {
    public static void main(String[] args) {     
        List<String> items = new ArrayList<>();
        items.add("Иван Иванов");
        items.add("Светлана Петрова");
        items.add("Кристина Белова");
        items.add("Анна Мусина");
        items.add("Анна Крутова");
        items.add("Иван Юрин");
        items.add("Петр Лыков");
        items.add("Павел Чернов");
        items.add("Петр Чернышов");
        items.add("Мария Федорова");
        items.add("Марина Светлова");
        items.add("Мария Савина");
        items.add("Мария Рыкова");
        items.add("Марина Лугова");
        items.add("Анна Владимирова");
        items.add("Иван Мечников");
        items.add("Петр Петин");
        items.add("Иван Ежов");
        
        Map<String, Integer> popularity = nameRepeat(items);

        LinkedHashMap<String, Integer> sortedPopularityp = sortPopularity(popularity);

        System.out.println(sortedPopularityp);
    } 
    
    public static Map<String, Integer> nameRepeat(List<String> it) {
        Map<String, Integer> out = new HashMap<>();
        for (int i = 0; i < it.size(); i++) {
            String name = it.get(i).split(" ")[0];
            if (out.containsKey(name)) {
                int count = out.get(name);
                out.put(name, ++count);
            } else {
                out.put(name, 1);
            }
        }

        return out;
    }

    public static LinkedHashMap<String, Integer> sortPopularity(Map<String, Integer> map) {
        LinkedHashMap<String, Integer> out = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int num : list) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(num)) {
                    out.put(entry.getKey(), num);
                }
            }
        }

        return out;
    }
}
