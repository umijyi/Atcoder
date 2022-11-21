import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
  	String s = new String();
    String[] old_s = new String[n];
    boolean flag = true;
    for (int i = 0; i < n; i++){
        s = sc.next();
        if (s.matches("[HDCS][A2-9TJQK]") != true) {
            flag = false;
            break;
        }
        for (int j = 0; j < old_s.length; j++) {
            if (s.equals(old_s[j]) == true) {
                flag = false;
                break;
            }
        }
        old_s[i] = s;
    }
    System.out.println(flag ? "Yes" : "No");
    sc.close();
  }
}
