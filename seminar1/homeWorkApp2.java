package seminar1;

public class homeWorkApp2 {
    public static void main(String[] args) {
        System.out.printf("Все простые числа от 1 до 1000:\n");
        int num = 1000;

        primeNumbers(num);
    }

    public static void primeNumbers(int n) {
        int[] arr = new int[n + 1];
 
        for (int i = 0; i <= n; i++) {
            arr[i] = 1;
        }
 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    arr[i * j] = 0;
                }
            }
        }
 
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 1) {
                System.out.printf("%s ", i);
            }
        }
    }
}
