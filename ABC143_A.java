import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int length = a - 2 * b;
        System.out.println(length > 0 ? length : 0);
        sc.close();
    }
}
