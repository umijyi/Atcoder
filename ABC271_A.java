import java.util.Scanner;

public class ABC271_A {
    public static void Main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            String m = Integer.toHexString(n);
            System.out.println(m);
    }
}