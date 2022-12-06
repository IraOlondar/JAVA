package seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class homeWorkApp3 {
    public static void main(String[] args) {
        List<Integer> intArr = GenArray();
 
        System.out.println("Сгенерированный массив:");
        Print(intArr);
        System.out.println();
        
        processedAray(intArr);
    }

    public static List<Integer> GenArray() {
        int i = 0;
        int n = 123;
        List<Integer> array = new ArrayList<>(n);
    
        while (i < n) {
           array.add(i++, rnd(0, 100));
        }
        
        return array;
     }

    public static void processedAray(List<Integer> a) {
        System.out.println("Max: " + Collections.max(a));
        System.out.println("Min: " + Collections.min(a));
        System.out.println("Avr: " + Math.ceil((a.stream().mapToDouble(x -> x).average().getAsDouble()) * 10) / 10);
    }
  

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void Print(List<Integer> arr) {
        int i = 0;
        
        System.out.print("[");
        for(int value : arr) {
            System.out.print(value + (i != arr.size() - 1 ? ", " : ""));
            i++;
        }
        System.out.print("]");
        System.out.println();
    }
}
