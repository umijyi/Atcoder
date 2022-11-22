import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "atcoder";
        int l = sc.nextInt() - 1;
        int r = sc.nextInt() - 1;
        for (int i = l; i <= r; i++) {
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}
