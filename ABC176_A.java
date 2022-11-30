import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (sum < n) {
            sum += x;
            i++;
        }
        System.out.println(t * i);
        sc.close();
    }
}
