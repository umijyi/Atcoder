import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int k;
        int[][] l = new int[256][256];
        for (int i = 0; i < n; i++) {
            k = sc.nextInt();
            for(int j = 0; j < k; j++) {
                l[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < q; i++) {
            System.out.println(l[sc.nextInt() - 1][sc.nextInt() - 1]);
        }
    }
}
