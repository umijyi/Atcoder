import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        int value = 0;
        int i;
        if ((x * 3) > y) {
            System.out.print(((n / 3) *y )+ ((n - (n / 3) * 3) * x));
        } else {
            System.out.print((n * x));
        }
        sc.close();
    }    
}
