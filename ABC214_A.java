import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 0;
        if (n <= 125) value += 4;
        else if (n <= 211) value += 6;
        else value += 8;
        System.out.print(value);
        sc.close();
    }
}
