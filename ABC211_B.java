import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = {"H", "HR", "2B", "3B"};
        String[] s_in = {sc.next(), sc.next(), sc.next(), sc.next()};
        boolean flag = true;

        Arrays.sort(s);
        Arrays.sort(s_in);
        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals(s_in[i])) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Yes" : "No");
        sc.close();
    }
}
