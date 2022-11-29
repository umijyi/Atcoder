import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        switch(sc.nextInt()) {
            case (25):
                s = "Christmas";
                break;
            case (24):
                s = "Christmas Eve";
                break;
            case (23):
                s = "Christmas Eve Eve";
                break;
            case (22):
                s = "Christmas Eve Eve Eve";
                break;
            default:
                break;
        }
        System.out.println(s);
        sc.close();
    }    
}
