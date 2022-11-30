import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("\\.");
        System.out.print(s[0]);
        if (Integer.parseInt(s[1]) < 3) System.out.println("-");
        else if (Integer.parseInt(s[1]) < 7) System.out.println();
        else System.out.println("+");
        sc.close();
    }
}
