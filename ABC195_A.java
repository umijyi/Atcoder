import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(h % m == 0 ? "Yes" : "No");
        sc.close();
    }
}
