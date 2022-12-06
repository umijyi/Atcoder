import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i > 0 && i % 100 == 0 ? "Yes" : "No");
        sc.close();
    }
}
