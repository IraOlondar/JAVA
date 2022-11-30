package seminar2;

public class lessenWorkApp1 {
    public static void main(String[] args) {
        int number = 100;

        StringBuilder c1 = new StringBuilder("a"); 
        StringBuilder c2 = new StringBuilder("b"); 
        StringBuilder result = new StringBuilder("");
        int i = 0;
        while (i++ <= number) {
            result.append(c1).append(c2);
        }

        System.out.print(result);
    }
}
