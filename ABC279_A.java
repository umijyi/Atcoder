import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'v') count++;
            if (s.charAt(i) == 'w') count += 2;
        }
        System.out.println(count);
        sc.close();
    }
}
