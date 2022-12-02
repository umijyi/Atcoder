import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s_compare = s.substring(0, 1);
        s_compare += s_compare + s_compare;
        System.out.println(!s_compare.equals(s) ? "Yes" : "No");
        sc.close();
    }
}
