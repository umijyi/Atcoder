import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() -1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {

                } else if (s.charAt(i) != s.charAt(j)) {
                    num = j;
                    flag = true;
                    break;
                }
            }
        }
        if (flag == true) {
            System.out.print(s.charAt(num));
        } else {
            System.out.print(-1);
        }
        sc.close();
    }    
}
