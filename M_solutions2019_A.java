import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()- 2;
        int value = 0;
        for (int i = 0; i < n; i++) {
            value += 180;
        }
        System.out.println(value);
        sc.close();
    }
}
