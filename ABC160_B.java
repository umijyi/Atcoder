import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int happy = 0;
        for (int i = 0; i < x/500; i++) {
            happy += 1000;
        }
        for (int i = 0; i < (x % 500)/5; i++) {
            happy += 5;
        }
        System.out.println(happy);
        sc.close();
    }
}
