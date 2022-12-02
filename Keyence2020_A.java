import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int m = 0;
        int count = 0;
        while (m < n) {
            if (h > w) {
                m += h;
            } else {
                m += w;
            }
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
