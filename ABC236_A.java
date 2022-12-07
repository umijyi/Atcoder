import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (i == a) System.out.print(s.charAt(b));
            else if (i == b) System.out.print(s.charAt(a));
            else System.out.print(s.charAt(i));
            
        }
        sc.close();
    }
}
