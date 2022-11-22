import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] week = new String[7];
        week[0] = "Saturday";
        week[1] = "Sunday";
        week[2] = "Monday";
        week[3] = "Tuesday";
        week[4] = "Wednesday";
        week[5] = "Thersday";
        week[6] = "Friday";
        String day = sc.next();
        int count = 0;

        for (int i = 0; i < week.length; i++) {
            if (day.equals(week[i])) {
                count = 7 - i;
            }
        }
        System.out.print(count);
        sc.close();
        
    }
}
