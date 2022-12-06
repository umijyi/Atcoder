import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >=42) n++;
        System.out.println("AGC" + String.format("%03d", n));
        sc.close();
    }
}
