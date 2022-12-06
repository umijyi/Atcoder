import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() % 2 == 1) {
                count++;
            }
            System.out.println(count);
        }
        System.out.println(count % 2 == 0 ? "YES" : "NO");
        sc.close();
    }
}