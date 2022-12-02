import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> week = Arrays.asList("SAT","FRI","THU","WED","TUE","MON","SUN");
        System.out.println(week.indexOf(sc.nextLine())+1);
        sc.close();
    }
}
