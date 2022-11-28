import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = false;
        if (s.charAt(0) == '0') {
            if (s.charAt(3) == '0') {
                flag = true;
                System.out.println("4");
            } else if (s.charAt(1) == '0' && s.charAt(7) == '0') {
                flag = true;
                System.out.println("2と8");
            } else if (s.charAt(4) == '0') {
                flag = true;
                System.out.println("5");
            } else if (s.charAt(2) == '0' && s.charAt(8) == '0') {
                flag = true;
                System.out.println("3と9");
            } else if (s.charAt(5) == '0') {
                flag = true;
                System.out.println("6");
            } else if (s.charAt(4) == '1') {
                if (s.charAt(1) == '1' || s.charAt(7) == '1') {
                    if (s.charAt(2) == '1' || s.charAt(8) == '1') {
                        if (s.charAt(5) == '1') {
                            if (s.charAt(3) == '1') {
                                if (s.charAt(6) == '1') {
                                    if (s.charAt(9) == '1') {
                                        flag = true;
                                        System.out.println("ぜんれつ");
                                    }
                                }
                            }
                        }
                    }
                }
            } 
        }
        String result = flag ? "Yes" : "No";
        System.out.println(result);
    }
}