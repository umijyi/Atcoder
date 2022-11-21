import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> s = new ArrayList<>();

        for (int i = 0; i < n+1; i++)
            s.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            s.get(a).add(b);
            s.get(b).add(a);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(s.get(i));
            System.out.print(s.get(i).size());
            for (int j = 0; j < s.get(i).size(); j++) {
                System.out.print(" ");
                System.out.print(s.get(i).get(j));
            }
            System.out.println();
        }
    }
}
