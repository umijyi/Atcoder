import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next().charAt(0) >= 'a' ? "a" : "A");
        sc.close();
    }
}
