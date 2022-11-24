import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean flag = true;
        if (s.length() < t.length()) {
            for (int i = 0; i< s.length(); i++) {
                if (t.charAt(i) != s.charAt(i)) {
                    flag = false;
                }
            }
        } else flag = false;
        if (flag) System.out.println("Yes");
            else System.out.println("No");
        sc.close();
    }
}