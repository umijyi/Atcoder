import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = 0;
        int hs = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            hs = sc.nextInt();
            if (h < hs) h = hs;
            else break;
        }
        System.out.println(h);
        sc.close();
    }
}
