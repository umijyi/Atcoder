import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt() + 1;
        int c = sc.nextInt() + 1;
        boolean flag = false;
        if (r > 1 && c > 1 && r < 15 && c < 15) {
            if ((r % 2) == 0 || (c % 2) == 0) {
                flag = true;
            }
        }
        if (flag = true) System.out.println("white");
        else System.out.println("black");
    }    
}
