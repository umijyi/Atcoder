import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'o') x += 1;
            else if (x > 0) x -= 1;
            else ;
            }
        System.out.println(x);
        sc.close();
    }
}
