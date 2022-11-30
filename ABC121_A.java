import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = 0;

        System.out.println(H-h>0 && W-w>0 ? (H-h)*(W-w) : 0);
    }
}
