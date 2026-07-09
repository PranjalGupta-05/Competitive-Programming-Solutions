import java.util.Scanner;
import java.lang.Math;

public class theatreSquare_1A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        long result = (long) Math.ceil((double) n / a) * (long) Math.ceil((double) m / a);
        System.out.println(result);
    }

}