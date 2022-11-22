import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[3][3];
        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print(a[r-1][c-1]);
    }    
}
