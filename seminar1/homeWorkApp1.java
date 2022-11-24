package seminar1;

import java.math.BigInteger;
import java.util.Scanner;

public class homeWorkApp1 {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.printf("Введите число N: ");
        int namber = Integer.parseInt(iScanner.nextLine()) ;
        iScanner.close();

        int sum = (namber * (namber + 1)) / 2;
        System.out.printf("Сумма чисел от 1 до %s: %s\n", namber, sum);
        System.out.printf("%s!: %s\n", namber, factorial(namber));
    }

    public static BigInteger factorial(int n) {
        if (n <= 1) return BigInteger.valueOf(1);
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}
