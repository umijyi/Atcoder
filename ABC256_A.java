import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 1;
        for (int i = 0; i < n; i++) {
            value *= 2;
        }
        System.out.print(value);
        sc.close();
    }    
}
