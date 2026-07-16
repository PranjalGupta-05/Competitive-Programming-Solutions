import java.util.*;

public class expression_479A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println(Math.max(a+b*c, Math.max(a*(b+c), Math.max(a*b*c, (a+b)*c))));
    }
}