import java.util.Scanner;

public class StringTask_118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char it : s.toCharArray()) {
            it=Character.toLowerCase(it);
            if ( it != 'a' && it != 'e' && it != 'i' && it != 'o' && it != 'u' && it != 'y') {
                sb.append(it);
            }
        }
        String result = "";
        for (int i = 0; i < sb.length(); i++) {
            result += "." + sb.charAt(i);
        }
        System.out.println(result);

        sc.close();
    }
}