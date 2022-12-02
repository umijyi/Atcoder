import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> weather = Arrays.asList("Sunny", "Cloudy", "Rainy");
        String s = sc.next();
        if (weather.indexOf(s) == 2) {
            System.out.println(weather.get(0));
        } else {
            System.out.println(weather.get(weather.indexOf(s) + 1));
        }
        sc.close();
    }    
}
