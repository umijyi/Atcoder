import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 5) b = 0;
        else if (a <= 12) b = b/2;
        else ;
        System.out.println(b);
        sc.close();
    }    
}
