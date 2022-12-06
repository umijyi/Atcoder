import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = (double)sc.nextInt() * (double)sc.nextInt() / 100;
        if (a % (double)1 != 0) System.out.println(a);
        else System.out.println((int)a);
        sc.close();
    }
}
