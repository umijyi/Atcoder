import java.util.Scanner;

public class ABC272_A {
    public static void main(String[] args) {
        
        System.out.println("入力してください。");

        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int sum = 0;
        for(int i = 0; i < a; i++){
            sum += sc1.nextInt();
        } 
        sc1.close();
        System.out.println(a);
        System.out.println(sum);
    }
}