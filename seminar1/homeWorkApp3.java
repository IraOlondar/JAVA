package seminar1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homeWorkApp3 {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.printf("Введите пример: ");
        String input = iScanner.nextLine();
        iScanner.close();
        
        if (input.length() != 0) {
            //Получаем список вида [число, число, знак действия]
            String[] inputString = riad(input);
            Double a = Double.parseDouble(inputString[0].replace(",", "."));
            Double b = Double.parseDouble(inputString[2].replace(",", "."));

            if (inputString[1] != "-E") {
                //Получаем результат решения
                String recCalc = calc(a, inputString[1], b);
      
                //Выводим результат вычисления
                System.out.printf("%s %s %s = %s", a, inputString[1], b, recCalc);
            } else {
                //Выводим ошибку
                System.out.println("Ошибка ввода, некоректные данные");
            }
            
        } else {
            System.out.println("Ошибка ввода, пустое значение");
        }
    }

    public static String[] riad(String str) {
        String[] result = {"0", "-E", "0"}; 

        str = str.replace(" ", "");
        str = str.replace("=", "");
        
        // Шаблон регулярного выражения
        String pattern = "([-]?[0-9]+[.,]?[0-9]*)([-+*\\/^])([-]?[0-9]+[.,]?[0-9]*)";

        Pattern checkPattern = Pattern.compile(pattern);
        Matcher matcher = checkPattern.matcher(str);
        
        //Проверка на соответствие шаблону
        if (matcher .matches()) {
            result[0] = str.replaceAll(pattern, "$1");
            result[1] = str.replaceAll(pattern, "$2");
            result[2] = str.replaceAll(pattern, "$3");
        }
        
        return result;
    }
    
    //Калькуляция значений а и b
    public static String calc(Double a, String action, Double b) {
        Double result = 0.0;

        if (b != 0.0 || !action.equals("/")) {
            switch (action) {
                case "+": 
                    result = a + b;
                    break;
                case "-": 
                    result = a - b;
                    break;
                case "*": 
                    result = a * b;
                    break;
                case "/": 
                    result = a / b;
                    break;
                case "^": 
                    result = Math.pow(a, b);
                    break;
                default:
                    return "-E";
            }
            return result + "";
        } else {
            return "-E";
        }
    }
    
    //Вывод результата на экран
    public static void print (String res) { 
        
    }
}
