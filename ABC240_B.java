import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> a = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(a.size());
        sc.close();
    }
}
