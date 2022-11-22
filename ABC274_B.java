import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[] x = new int[w+1];
        int count = 0;
        String c = new String();
        for (int i = 0; i < h; i++){
            c = sc.next();
            for (int j = 0; j < w; j++) {
                if (c.charAt(j) == '#') {
                    x[j]++;
                }
            }
        }
        for (int i = 0; i < w; i++) {
            System.out.print(x[w]+ " ");
        }
        sc.close();
    }
}
