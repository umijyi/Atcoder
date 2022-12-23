import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt() - sc.nextInt();
        int mag = 1;
        for (int i = 0; i < value; i++) mag *= 32;
        System.out.println(mag);
        sc.close();
    }
}
