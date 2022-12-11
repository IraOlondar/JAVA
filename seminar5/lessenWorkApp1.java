package seminar5;

import java.util.HashMap;
import java.util.Map;

public class lessenWorkApp1 {
    public static void main(String[] args) {     
        Map<String, String> db = new HashMap<>();
        db.putIfAbsent("123456", "Иванов"); 
        db.putIfAbsent("321456", "Васильев");
        db.putIfAbsent("234561", "Петрова");
        db.putIfAbsent("234432", "Иванов");
        db.putIfAbsent("654321", "Петрова");
        db.putIfAbsent("123456", "Иванов");

        System.out.println(db);

        for (String k : db.keySet()) {
            if (db.get(k).toLowerCase().equals("Иванов".toLowerCase()) )  {
                System.out.printf("Паспорт %s фамилия %s\n", k, db.get(k));
            }
        }
    }
}
