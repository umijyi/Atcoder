import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            int[] x = new int[k];
            for (int j = 0; j < n; j++) {
                x[j] = sc.nextInt();
            }
        }
        sc.close();
    }
}
