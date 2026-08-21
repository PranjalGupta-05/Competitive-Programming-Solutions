import java.util.*;

public class UltraFastMathematician_61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        System.out.println(result.toString());
        sc.close();
    }
}