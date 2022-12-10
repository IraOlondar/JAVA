package seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class lessenWorkApp1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.printf("Введите данные: ");
        String input;
        int index;
        String value;
        String[] arr;
        Boolean condition = false;
        LinkedList<String> lst = new LinkedList<>();
        
        do {
            input = iScanner.nextLine();
            if (!input.equals("exit")) { 
                arr = input.split("~");

                if (arr.length == 2) {
                    value = arr[0];
                    try {
                        index = Integer.parseInt(arr[1]);

                        if (!value.equals("print")) {
                            if (lst.size() - 1 < index) {
                                int i = 0;
                                int x = index - lst.size() + 1;
                                while (i++ < x) {
                                    lst.add("");
                                }
                            }
                            lst.set(index, value);
                        } else {
                            System.out.println(lst.remove(index));
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("После ~ должно быть число!");
                    }          
                } else {   
                    System.out.println("Где индекс?");
                }
 
                condition = true;
                System.out.println("Еще раз");
            }
        } while (condition);        
        iScanner.close();
        System.out.println("До встречи!");
    }
}
