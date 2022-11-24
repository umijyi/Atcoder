import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; count <= 6; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (count > 6) break;
                System.out.print(s.charAt(j));
                count++;
            }
        }
        sc.close();
    }
}
