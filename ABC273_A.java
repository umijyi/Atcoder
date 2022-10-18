import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 1;
        for (int i = 1; i <= n; i++){
            a = f(a, i);
        }
        System.out.println(a);
    }
    public static int f(int num1, int num2){
        num1 *= num2;
        return num1;
    }
}
