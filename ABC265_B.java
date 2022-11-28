import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        int[] x = new int[m];
        int[] y = new int[m];
        
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt() - 1;
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            t -= a[i];
            for (int j = 0; j < m; j++) {
                if ((x[j]) == i) {
                    t += y[j];
                }
            }
            if (t < 0) break;
        }
        if (t < 0) System.out.println("No");
        else System.out.println("Yes");
    }
}
