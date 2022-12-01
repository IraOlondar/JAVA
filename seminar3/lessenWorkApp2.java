package seminar3;

import java.util.ArrayList;
import java.util.List;

public class lessenWorkApp2 {
    public static void main(String[] args) {
        String[] arr = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};

        int size = 321;
        List<String> planet = genArray(arr, size);

        System.out.println(planet);
        System.out.println();

        countElements(planet);
    }

    public static void countElements(List<String> arr) {
        arr.sort(null);
        String prevItem = "";
        int mainCount;
        for (String item : arr) {
            if (!prevItem.equals(item)) {
                mainCount = 0;
                countArray(arr, 0, item, mainCount);
                prevItem = item;
            }
        }
    }

    public static void countArray(List<String> arr, int currentPos, String item, int mainCount) {
        if(currentPos == arr.size()){
            System.out.println(item + " - " +  mainCount);
            return;
        } else {
            if (arr.get(currentPos).toString().equals(item)) {
                mainCount++;
            }
            countArray(arr, currentPos + 1, item, mainCount);
        }
    }
    
    public static List<String> genArray(String[] arr, int size) {
        int i = 0;
        int n = size;
        List<String> array = new ArrayList<>(n);
    
        while (i < n) {
            array.add(arr[rnd(0, arr.length - 1)]);
            i++;
        }
        
        return array;
    }

    public static Integer rnd(Integer min, Integer max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
