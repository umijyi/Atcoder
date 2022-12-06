import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((int)(n * 1.08) < 206) System.out.println("Yay!");
        else if ((int)(n * 1.08) == 206) System.out.println("so-so");
        else System.out.println(":(");
        sc.close();
    }
}
