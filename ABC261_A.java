import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        int count = 0;
        for (int i = l1; i <= r1; i++) {
            for (int j = l2; j <= r2; j++) {
                if (i == j) {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.print(count - 1);
        } else {
            System.out.print(0);
        }
    }
}
