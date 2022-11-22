import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int N = n % 100;
        if(N < 10){
            System.out.println("0" + N);
        }else{
            System.out.println(N);
        }
        
    }
}
