package seminar5;

import java.util.HashMap;
import java.util.Map;

public class lessenWorkApp3 {
    public static void main(String[] args) {     
        String input = "MMXXII";
        int out = convert(input);
        System.out.println(input + " -> " + out);
    }

    public static int convert(String str) {
        Map<Character, Integer> db = new HashMap<>();
        db.put('I', 1);
        db.put('V', 5);
        db.put('X', 10);
        db.put('L', 50);
        db.put('C', 100);
        db.put('D', 500);
        db.put('M', 1000);
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || db.get(str.charAt(i)) <= db.get(str.charAt(i - 1)))
                res += db.get(str.charAt(i));
            else
                res += db.get(str.charAt(i)) - 2 * db.get(str.charAt(i - 1));
        }
        return res;
    }
}
