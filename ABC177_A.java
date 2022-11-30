import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        int time = 0;
        boolean flag = true;
        while (d > 0) {
            d -= s;
            time++;
            if (t < time) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Yes" : "No");
        sc.close();
    }
}
