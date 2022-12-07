import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Character.getNumericValue(s.charAt(0)) * Character.getNumericValue(s.charAt(2)));
        sc.close();
    }
}
