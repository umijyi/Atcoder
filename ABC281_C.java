import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        boolean flag = false;
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i]  = sc.nextLong();
        }
        while(t > 0) {
            for (int i = 0; i < n; i++) {
                if (t < a[i]) {
                    System.out.println(i + 1 + " " + t);
                    flag = true;
                    break;
                }
                t -= a[i];
            }
            if (flag) break;
        }
        sc.close();
    }
}
