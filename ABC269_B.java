import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] S = new String[10][10];
        int i, j;
        int a,b,c,d;
        boolean flag = false;
        for ( i = 0; i <= 9; i++) {
            S[i] = sc.next().split("");
        }
		System.out.print(S[1][1]);
    	for(i = 0; i < S.length; i++){
          for (j = 0; j < S.length; j++){
          	if (S[i][j].equals("#")){
                a = i + 1;
                c = j + 1;
                break;
            }
          }
        }
        System.out.println(a + " " +c);
    }
}
