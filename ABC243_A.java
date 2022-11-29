import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int f = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        sc.close();
        while(true){
            if ((v -= f) < 0) {
                System.out.println("F");
                return ;
            }
            if ((v -= m) < 0) {
                System.out.println("M");
                return ;
            }
            if ((v -= t) < 0) {
                System.out.println("T");
                return ;
            }
        }
  
    }
}
