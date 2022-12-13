import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = false;
        try{
            if (s.matches("[A-Z].+[A-Z]")) {
                s = s.substring(1, s.length()-1);
                if (s.length() == 6) {
                    if (Integer.valueOf(s) >= 100000 && Integer.valueOf(s) <= 999999) { 
                        flag = true;
                    }
                }
            }
        }catch(NumberFormatException e) {
        }
        System.out.println(flag ? "Yes" : "No");
        sc.close();
    }
}
