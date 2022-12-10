package seminar4;

import java.util.Scanner;
import java.util.Stack;

public class lessenWorkApp2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите данные: ");
        String input;
        Boolean condition = false;
        Stack<String> lst = new Stack<>();
        
        do {
            input = iScanner.nextLine();
            
            if (!input.equals("exit")) { 
                if (input.length() > 0) {
                    if (input.equals("print")) {
                        int i = lst.size();
                        System.out.print("Result: ");
                        System.out.print(lst.get(--i));
                        while (i > 0) {
                            System.out.print(", " + lst.get(--i));
                        }
                        System.out.print("\n");
                    } else if (input.equals("revert")) {
                        lst.pop();
                        System.out.println("Result: Ok!");
                    } else {
                        lst.add(input);
                    }
                    condition = true;
                } else {
                    System.out.println("Пустая строка!");
                }
                System.out.print("Еще раз: ");
            }
        } while (condition);        
        iScanner.close();
        System.out.println("До встречи!");
    }
}
