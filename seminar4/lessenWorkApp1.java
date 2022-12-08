package seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

public class lessenWorkApp1 {
    public static void main(String[] args) {
        int i;
        var s = System.currentTimeMillis();
        ArrayList<String> array = new ArrayList<>();
        for (i = 0; i < 200_000; i++) {
            array.add("+");
        }
        System.out.println("Time add to ArrayList: " + (System.currentTimeMillis() - s));

        s = System.currentTimeMillis();
        i = 0;
        while (i < array.size()) {
            array.remove(i);
        }
        System.out.println("Time remove from ArrayList: " + (System.currentTimeMillis() - s));

        s = System.currentTimeMillis();
        LinkedList<String> array1 = new LinkedList<>();
        for (i = 0; i < 200_000; i++) {
            array1.add("+");
        }
        System.out.println("Time add to LinkedList: " + (System.currentTimeMillis() - s));

        s = System.currentTimeMillis();
        i = 0;
        while (i < array1.size()) {
            array1.remove(i);
        }
        System.out.println("Time remove from LinkedList: " + (System.currentTimeMillis() - s));
    }
}