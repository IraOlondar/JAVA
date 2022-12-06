package seminar3;

import java.util.ArrayList;
import java.util.List;

    public class homeWorkApp2 {
    public static void main(String[] args) {
        List<Integer> intArr = GenArray();


        System.out.println("Сгенерированный массив:");
        Print(intArr);
        System.out.println();
        
        List<Integer> resArr = processedAray(intArr);
        System.out.println("Обработанный массив:");
        Print(resArr);
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

    public static List<Integer> processedAray(List<Integer> a) {
        List<Integer> arr = new ArrayList<>();
        for (Integer i = 0; i < a.size() ; i++) {
            if (a.get(i) % 2 != 0) {
                arr.add(a.get(i));
            }
        }

        return arr;
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
