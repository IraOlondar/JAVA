package seminar4;

import java.util.LinkedList;

public class homeWorkApp1 {
    public static void main(String[] args) {
        
        LinkedList<Integer> array = GenArray(20);
        System.out.println("\nСгенерированный список:");
        System.out.println(array);
        
        LinkedList<Integer> newList = reverseLinkedList(array);
        System.out.println("\nОбработанный список:");
        System.out.println(newList);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> array) {
        for (int i = 0; i < array.size() / 2; i++) {
            Integer temp = array.get(i);
            array.set(i, array.get(array.size() - i - 1));
            array.set(array.size() - i - 1, temp);
        }
        return array;
    }
    
    public static LinkedList<Integer> GenArray(int n) {
        int i = 0;
        LinkedList<Integer> array = new LinkedList<>();
    
        while (i < n) {
           array.add(i++, rnd(0, 100));
        }
        return array;
    }
  
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
