package seminar2;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class homeWorkApp2 {
   public static void main(String[] args) {
      int[] intArr = GenArray();
      
      System.out.println("Сгенерированный массив:");
      Print(intArr);
      System.out.println();
      
      int[] sortArray = SortBubble(intArr);
      System.out.println("Отсортированный массив:");
      Print(sortArray);
   }

   public static int[] GenArray() {
      int i = 0;
      int n = 123;
      int[] array = new int[n];
  
      while (i < n) {
          array[i++] = rnd(0, 100);
      }
      
      return array;
   }

   public static int[]  SortBubble(int[] arr) {
      int tmp;
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr.length - 1; j++) {
              
            log(arr[j] + ", " + arr[j + 1]); 
            if (arr[j] > arr[j + 1]) {
               tmp = arr[j];
               arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
         }  
      }
  
      return arr;
   }

   public static int rnd(int min, int max) {
      max -= min;
      return (int) (Math.random() * ++max) + min;
   }

   public static void Print(int[] arr) {
      int i = 0;
      
      System.out.print("[");
      for(int value : arr) {
         System.out.print(value + (i != arr.length - 1 ? ", " : ""));
          i++;
      }
      System.out.print("]");
      System.out.println();
   }

   public static void log(String txt) {
      String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
      try (FileWriter fw = new FileWriter("seminar2/log2.txt", true)) {
         fw.write(timeStamp + " -- " + txt + "\n");
         fw.flush();
      } catch (IOException ex) {
            System.out.println(ex.getMessage());
      }
   }
}
