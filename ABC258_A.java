import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] time = new int[4];
        time[0] = 2;
        time[1] = 1 + (k / 60);
        time[2] = (k % 60) / 10;
        time[3] = (k % 60) % 10;
        System.out.print(Integer.valueOf(time[0]).toString() + Integer.valueOf(time[2]).toString() 
            + ":" + Integer.valueOf(time[2]).toString() + Integer.valueOf(time[3]).toString());
        sc.close();
    }    
}
