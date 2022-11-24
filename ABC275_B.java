import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger value = new BigInteger("0");
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        for (int i = 0; i < 3; i++){
            a = a.multiply(sc.nextBigInteger());
        }
        for (int i = 0; i < 3; i++){
            b = b.multiply(sc.nextBigInteger());
        }
        System.out.println(a);
        System.out.println(b);
        System.out.print(a.subtract(b).remainder(new BigInteger("998244353")));
        sc.close();
    }    
}
