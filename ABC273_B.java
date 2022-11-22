import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int k = sc.nextInt();
        int[] num = new int[x.length()];
        for (int i = x.length()-1; i >= 0; i--) {
            num[i] += Character.getNumericValue(x.charAt(i)); 
            if (i > x.length() - k -1) {
                if (num[i] >= 5) {
                    num[i] = 0;
                    num[i-1] += 1;
                } else {
                    num[i] = 0;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }
}