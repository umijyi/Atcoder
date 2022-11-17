import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = sc.nextInt();
        int n = 1, m, i;
        for (i = 0; i < k; i++){
            n *= 10;
        }
        x /= n;
        m = x % 10;
        if (m <= 4) {
            x -=m;
        } else{
            x += (10 - m);
        }
        /*
            for (i = count; i > 0; i--){
            
        }*/
        System.out.println(x);
        System.out.println(m);
    }
}