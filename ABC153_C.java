import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k  =sc.nextInt();
        int[] h = new int[n];
        long sum = 0;
        for(int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            sum += h[i];
        }
        Arrays.sort(h);
        if(n <= k){
            System.out.println(0);
        }else{
            for(int i=0;i<k;i++){
                sum -= h[n-i-1];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
