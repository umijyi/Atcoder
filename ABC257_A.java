import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;
        int j = 0;
        byte value = 0x41;

        for (int i = 0; i < x; count++) {
            if (count == n) {
                value++;
                i++;
                count = 0;
            }
            if (j == (x - 1)) break;
            j++;
        }
        System.out.println(Character.toChars(value));
    }
}
