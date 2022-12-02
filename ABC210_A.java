import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int value = 0;
        for (int i = 0; i < n; i++) {
            if (a <= i) {
                value += y;
            } else {
                value += x;
            }
        }
        System.out.println(value);
        sc.close();
    }
}
