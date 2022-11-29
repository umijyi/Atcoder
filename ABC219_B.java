import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[4];
        String a = new String();
        for (int i = 0; i < 3; i++) {
            s[i] = sc.next();
        }
        String t = sc.next();
        for (int i = 0; i < t.length(); i++) {
            a += s[Character.getNumericValue(t.charAt(i) - 1)];
        }
        System.out.println(a);
        sc.close();
    }    
}
