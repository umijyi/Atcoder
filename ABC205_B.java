import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = i+1;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                flag  = false;
            }
        }
        System.out.println(flag ? "Yes" : "No");
        sc.close();
    }
}
