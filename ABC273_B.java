import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < k; i++) {
            //long m = (long)Math.pow((double)10, (double)(i + 1));
            if ((x % 10) >= 5) {
                x = (x / 10) + 1;
            } else {
                x = x / 10;
            }
            count++;
        }
        x *= (long)Math.pow((double)10, (double)count);
        System.out.println(x);
    }
}