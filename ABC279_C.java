import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] value = new char[w][h];
        char[] c;
        String[] scolumn = new String[w];
        String[] tcolumn = new String[w];
        boolean flag = true;
        for (int i = 0; i < h; i++) {
            c  = sc.next().toCharArray();
            int j = 0;
            for (char ch : c) {
                value[j][i] = ch;
                j++;
            }
        }
        for (int i = 0; i < w; i++) {
            scolumn[i] = new String(value[i]);
        }
        for (int i = 0; i < h; i++) {
            c  = sc.next().toCharArray();
            int j = 0;
            for (char ch : c) {
                value[j][i] = ch;
                j++;
            }
        }
        for (int i = 0; i < w; i++) {
            tcolumn[i] = new String(value[i]);
        }
        
        Arrays.sort(scolumn);
        Arrays.sort(tcolumn);
        for (int i = 0; i < w; i++) {
            if (!scolumn[i].equals(tcolumn[i])) flag = false;
        }
        System.out.println(flag ? "Yes" : "No");
        sc.close();
    }    
}