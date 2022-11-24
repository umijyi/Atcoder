import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] S = new String[10][10];
        int a,b,c,d;
        int s_i = -1;
        int s_j = -1;
        int i_count = 0;
        int j_count = 0;
        boolean wflag = false;
        boolean hflag = false;
        for (int i = 0; i < 10; i++) {
            S[i] = sc.next().split("");
        }
		for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == s_i - 1 && S[i][j].toString().equals("#")) {
                    j_count++;
                    
                }
                if (j == s_j - 1 && S[i][j].toString().equals("#")) {
                    i_count++;
                }
                if (S[i][j].toString().equals("#") && s_j == -1 && s_i == -1) {
                    s_j = j + 1;
                    s_i = i + 1;
                    j_count = s_j;
                    i_count = s_i;
                }
                
                
            }
        }
        System.out.println(s_i + " " +i_count);
        System.out.println(s_j + " " +j_count);
        sc.close();
    }
}
