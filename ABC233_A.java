import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        y -= x;
        for (int i = 0;  y > 0; i++) {
            y -= 10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
