import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int m = -1;
        if (x >= 0) {
            if(x > y) {
                if (z < 0) {
                    m = x - 2*z;
                } else if (z >= 0 && z < y) {
                    m = x;
                } else {}
            } else {
                m = x;
            }
        } else if (x < 0) {
            if (y > x) {
                if (z > y &&  y < 0) {
                    m = -x;
                } else if (y < 0 && z >= 0) {
                    m = -(x - 2*z);
                } else if (0 < y) {
                    m = -x;
                } else {}
            } else {
                m = -x;
            }
        }
        System.out.println(m);
    }
}
