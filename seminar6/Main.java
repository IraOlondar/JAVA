package seminar6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lessenWorkApp1 {
    public static void main(String[] args) {     
        Depository depository = new Depository();
        depository.addNotebook(new Notebook(depository.getNextId(), "Asus", 16, 512, "windows"));
        depository.addNotebook(new Notebook(depository.getNextId(), "Lenovo", 8, 1024, "windows"));
        depository.addNotebook(new Notebook(depository.getNextId(), "Samsung", 16, 2048, "linux"));
        depository.addNotebook(new Notebook(depository.getNextId(), "Samsung", 4, 256, "windows"));
        depository.addNotebook(new Notebook(depository.getNextId(), "Samsung", 4, 256, "windows"));
        depository.addNotebook(new Notebook(depository.getNextId(), "Acer", 32, 1024, "windows"));

        Scanner iScanner = new Scanner(System.in, "Cp866");
        String input;
        boolean condition = false;
        int step = 0;
        
        do {
            if (step == -1) {
                System.out.println("9. Повторить отбор");
                System.out.println("10. Выход");
            } else if  (step == 0) {
                System.out.println(
                    ConsoleColors.GREEN
                    + "Введите цифру, соответствующую необходимому критерию:" 
                    + ConsoleColors.RESET
                );
                System.out.println("1. Brand");
                System.out.println("2. Ram");
                System.out.println("3. Hdd");
                System.out.println("4. Os");
            }
            input = iScanner.nextLine();
            condition = true;
            if (input.length() > 0) {
                step = getParams(depository, input, step);
            } else {
                System.out.println(
                    ConsoleColors.GREEN
                    + "Пустая строка!"
                    + ConsoleColors.RESET
                );
                System.out.print(
                    ConsoleColors.GREEN
                    + "Еще раз: "
                    + ConsoleColors.RESET
                );
            }
            if (input.equals("10")) {  
                condition = false;
            } else if (input.equals("9")) {
                step = 0;
            }
        } while (condition);        
        iScanner.close();
        System.out.println(
            ConsoleColors.GREEN
            + "До встречи!"
            + ConsoleColors.RESET
        );
    }

    public static int getParams(Depository depository, String input, int step) {
        if (step == 0) {
            switch (input) {
                case "1":
                    System.out.printf(
                        ConsoleColors.GREEN 
                        + "Веедите значение Brand из %s: "
                        + ConsoleColors.RESET, 
                        depository.getFieldListValueBrand());
                    return 1;
                case "2":
                    System.out.printf(
                        ConsoleColors.GREEN 
                        + "Веедите значение Ram из %s: "
                        + ConsoleColors.RESET, 
                        depository.getFieldListValueRam());
                    return 2;
                case "3":
                    System.out.printf(
                        ConsoleColors.GREEN 
                        + "Веедите значение Hdd из %s: "
                        + ConsoleColors.RESET, 
                        depository.getFieldListValueHdd());
                    return 3;
                case "4":
                    System.out.printf(
                        ConsoleColors.GREEN 
                        + "Веедите значение Os из %s: "
                        + ConsoleColors.RESET, 
                        depository.getFieldListValueOs());
                    return 4;
                default:
                    break;
            }
        } else {
            List<Notebook> res = new ArrayList<>();
            switch (step) {
                case 1:
                    res = depository.getProductByBrand(input);
                    break;
                case 2:
                    res = depository.getProductByRam(input);
                    break;
                case 3:
                    res = depository.getProductByHdd(input);
                    break;
                case 4:
                    res = depository.getProductByOs(input);
                    break;
                default:
                    break;
            }
            for (Notebook notebook : res) {
                System.out.println(
                    ConsoleColors.RED
                    + notebook.printf() 
                    + ConsoleColors.RESET
                );
            }
        }
        return -1;
    }
}
