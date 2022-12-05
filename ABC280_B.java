import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int old_s = 0;
        for (int i = 0; i < n; i++) {
            s = sc.nextInt();
            System.out.print(s - old_s + " ");
            old_s = s;
        }
    }
}
