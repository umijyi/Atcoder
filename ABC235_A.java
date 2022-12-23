import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(1)) + Character.getNumericValue(s.charAt(2));
        
        System.out.println(111 * a);
        sc.close();
    }
}
