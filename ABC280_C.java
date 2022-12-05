import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        for (int i = 0; i < t.length(); i++) {
            if (i < s.length()) {
                if (s.charAt(i) != t.charAt(i)) {
                    System.out.println(i + 1);
                    break;
                }
            } else System.out.println(i+1);
        }
        sc.close();
    }
}
