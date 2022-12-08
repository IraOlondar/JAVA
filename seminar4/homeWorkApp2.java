package seminar4;

import java.util.LinkedList;

public class homeWorkApp2 {
    public static void main(String[] args) {
        
        LinkedList<Integer> array = GenArray(20);
        System.out.println("\nСгенерированный список:");
        System.out.println(array);
        enqueue(array, 10);
        System.out.println(dequeue(array));
        System.out.println(first(array));
        System.out.println(array);
    }

    public static void enqueue(LinkedList<Integer> arr, int n) {
        arr.addLast(n);
    }
    
    public static int dequeue(LinkedList<Integer> arr) {
        return arr.pollFirst();
    }
    
    public static int first(LinkedList<Integer> arr) {
        return arr.getFirst();
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
