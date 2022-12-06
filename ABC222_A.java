import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(String.format("%4d", sc.nextInt()).replace(" ", "0"));
        sc.close();
    }
}
