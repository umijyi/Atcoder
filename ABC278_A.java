import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            if (i - (k-1) > 0) {
                System.out.print(a + " ");
            } else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println("0 ");
        }
        System.out.println();
        sc.close();
    }    
}
