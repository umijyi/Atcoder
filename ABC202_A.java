import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice = {6, 5, 4, 3, 2, 1};
        int value = 0;
        for (int i = 0; i < 3; i++) {
            value += dice[sc.nextInt() - 1];
        }
        System.out.println(value);
        sc.close();
    }
}
