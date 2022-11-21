import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
  	Scanner sc = new Scanner(System.in);
  	String S = new String();
    int place = -1;
    S = sc.nextLine();
    for (int i = 0; i < S.length(); i++){
      if (S.charAt(i) == 'a'){
        place = i + 1;
      }
    }
    System.out.println(place);
    sc.close();
  }
}
