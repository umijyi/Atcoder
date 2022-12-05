import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        int k = 0;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        while(k < list.size()) {
            System.out.println(list.size());
            System.out.println(k);
            for (int j = k + 1; j < list.size(); j++) {
                System.out.print(list.get(k) + " ");
                System.out.println(list.get(j));
                if ((list.get(k) % 2 == 0 && list.get(j) % 2 == 0) || (list.get(k) % 2 == 1 && list.get(j) % 2 == 1)) {
                    list.add(list.get(k) + list.get(j));
                    System.out.println(list.get(list.size()-1));import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        int k = 0;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        while(k < list.size()) {
            System.out.println(list.size());
            System.out.println(k);
            for (int j = k + 1; j < list.size(); j++) {
                System.out.print(list.get(k) + " ");
                System.out.println(list.get(j));
                if ((list.get(k) % 2 == 0 && list.get(j) % 2 == 0) || (list.get(k) % 2 == 1 && list.get(j) % 2 == 1)) {
                    list.add(list.get(k) + list.get(j));
                    list.remove(k);
                    list.remove(j);
                    k = -1;
                    break;
                }
            }
            k++;
        }
        System.out.println(flag ? "Yes" : "No");
        sc.close();
    }
}