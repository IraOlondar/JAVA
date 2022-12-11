package seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class homeWorkApp1 {
    public static void main(String[] args) {     
        List<Map<String, List<String>>> phoneBoock = new ArrayList<>();

        addContact(phoneBoock, "Кочетков Никита", List.of("2342342", "345353453"));
        addContact(phoneBoock, "Рубцова София", List.of("2342342"));
        addContact(phoneBoock, "Воронов Денис", List.of("95745745", "254343667"));
        addContact(phoneBoock, "Митрофанова Варвара", List.of("3453453452", "685645633"));
        addContact(phoneBoock, "Иванова Марьяна", List.of("3452311467", "896454333", "556343453"));
        addContact(phoneBoock, "Воронов Денис", List.of("95745745", "254343667"));
        addContact(phoneBoock, "Корнилова Вероника", List.of("4567898044"));
        addContact(phoneBoock, "Мартынова Лилия", List.of("232423366"));
        addContact(phoneBoock, "Панфилов Николай", List.of("457657867"));

        for (int i = 0; i < phoneBoock.size(); i++) {
            Map<String, List<String>> elem = phoneBoock.get(i);
            for (String k :elem.keySet()) {
                String phoneString = String.join(", ", elem.get(k));
                System.out.printf("%s. %s (%s)\n",i + 1,  k, phoneString);
            }
        }
    }

    public static void addContact(List<Map<String, List<String>>> arr, String fio, List<String> phone) {
        
        Map<String, List<String>> person = new HashMap<>();
        person.put(fio, phone);
        arr.add(person);
    }
}
