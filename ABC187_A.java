import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int value_a = 0;
        int value_b = 0;
        for (int i = 0; i < 3 ; i++) {
            value_a += Character.getNumericValue(a.charAt(i));
            value_b += Character.getNumericValue(b.charAt(i));
        }
        System.out.println(value_a > value_b ? value_a : value_b);
        sc.close();
    }
}
