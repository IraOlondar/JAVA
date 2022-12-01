package seminar3;

import java.util.ArrayList;
import java.util.List;

public class lessenWorkApp1 {
    public static void main(String[] args) {
        List<Integer> intArr = GenArray();
      
        System.out.println("Сгенерированный массив:");
        System.out.println(intArr);
        System.out.println();
        
        intArr.sort(null);
        System.out.println("Отсортированный массив:");
        System.out.println(intArr);
    }

    public static List<Integer> GenArray() {
        int i = 0;
        int n = 123;
        List<Integer> array = new ArrayList<>(n);
    
        while (i < n) {
            array.add(rnd(0, 9));
            i++;
        }
        
        return array;
    }

    public static Integer rnd(Integer min, Integer max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
