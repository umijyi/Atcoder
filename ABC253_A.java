import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        int[] numclone = new int[3];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            numclone[i] = num[i];        
        }
        Arrays.sort(num);
        if (numclone[1] == num[1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
