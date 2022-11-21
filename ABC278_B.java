import java.io.CharConversionException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1, h2, m1, m2;
        String h = sc.next();
        String m = sc.next();
        

        if (h.length() == 2){
            h1 = Character.getNumericValue(h.charAt(0));
            h2 = Character.getNumericValue(h.charAt(1));
        } else { 
            h1 = 0;
            h2 = Character.getNumericValue(h.charAt(0));
        }
        if (m.length() == 2){
            m1 = Character.getNumericValue(m.charAt(0));
            m2 = Character.getNumericValue(m.charAt(1));
        } else { 
            m1 = 0;
            m2 = Character.getNumericValue(m.charAt(0));
        }
        while (true) {
            if (m2 > 9) {
                m1++;
                m2 = 0;
            }
            if (m1 > 5) {
                h2++;
                m1 = 0;
            }
            if (h1 == 2 && h2 == 4 && m1 == 0 && m2 == 0 ) {
                h1 = 0;
                h2 = 0;
                m1 = 0;
                m2 = 0;
            } else if (h2 > 9) {
                h1++;
                h2 = 0;
            }
            if ((h1 == 2 && m1 <= 3) || (h1 < 2 && h2 < 6)){
                System.out.print(h1);
                System.out.print(h2);
                System.out.print(" ");
                System.out.print(m1);
                System.out.println(m2);
                break;
            }
            m2++;
        }
        sc.close();
    }    
}
