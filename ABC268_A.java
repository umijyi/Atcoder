import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        count++;
        if (num[1] != num[0]) count++;
        if (num[2] != num[1] && num[2] != num[0]) count++;
        if (num[3] != num[2] && num[3] != num[1] && num[3] != num[0]) count++;
        if (num[4] != num[3] && num[4] != num[2] && num[4] != num[1] && num[4] != num[0]) count++;
        System.out.print(count);
    }
}
