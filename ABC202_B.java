import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = (s.length()- 1); i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '9') System.out.print("6");
            else if (c == '6') System.out.print("9");
            else System.out.print(c);
        }
        sc.close();
    }
}
