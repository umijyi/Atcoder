import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> enki = new HashMap<>();
        enki.put("A", "T");
        enki.put("T", "A");
        enki.put("C", "G");
        enki.put("G", "C");
        System.out.println(enki.get(sc.next()));
        sc.close();
    }
}
