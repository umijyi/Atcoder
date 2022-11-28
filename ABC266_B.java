import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n % 998244353;
        if (a < 0)
        	a+= 998244353;
        	System.out.println(a);
        sc.close();
    }
}
