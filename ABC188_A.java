import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (y > x) System.out.println(y - x < 3 ? "Yes" : "No");
        else System.out.println(x - y < 3 ? "Yes" : "No");
        sc.close();
    }
}
