import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int count = 0;
        int value;
        boolean flag1 = false;
        boolean flag2 = false;

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        if ((num[0] == num[1] && num[1] == num[2] && num[3] == num[4]) || (num[0] == num[1] && num[2] == num[3] && num[3] == num[4])) {
            System.out.print("yes");
        } else {
            System.out.print("No");
        }
    }
}
