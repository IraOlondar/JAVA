package seminar3;

import java.util.ArrayList;
import java.util.List;

public class homeWorkApp1 {
   public static void main(String[] args) {
      List<Integer> intArr = new ArrayList<>();
      intArr = GenArray();
      
      System.out.println("Сгенерированный массив:");
      Print(intArr);
      System.out.println();
      
      sortArray(intArr, 0, (intArr.size() - 1));
      System.out.println("Отсортированный массив:");
      Print(intArr);
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

   public static void sortArray(List<Integer> a, int lo, int hi) {
      if (hi <= lo)
          return;
      int mid = lo + (hi - lo) / 2;
      sortArray(a, lo, mid);
      sortArray(a, mid + 1, hi);
  
      List<Integer> buf = new ArrayList<>(a);
      
      for (int k = lo; k <= hi; k++)
          buf.set(k, a.get(k));
  
      int i = lo, j = mid + 1;
      for (int k = lo; k <= hi; k++) {
  
          if (i > mid) {
              a.set(k, buf.get(j));
              j++;
          } else if (j > hi) {
              a.set(k, buf.get(i));
              i++;
          } else if (buf.get(j) < buf.get(i)) {
              a.set(k, buf.get(j));
              j++;
          } else {
              a.set(k, buf.get(i));
              i++;
          }
      }
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
