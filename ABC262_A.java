import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4) == 2) {
        } else {
            while((year % 4) != 2) {
                year++;
            }
        }
        System.out.print(year);
        sc.close();
    }
}
