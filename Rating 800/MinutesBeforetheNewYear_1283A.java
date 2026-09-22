import java.util.*;

public class MinutesBeforetheNewYear_1283A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            System.out.println((23 - h) * 60 + (60 - m));
        }
        sc.close();
    }
}