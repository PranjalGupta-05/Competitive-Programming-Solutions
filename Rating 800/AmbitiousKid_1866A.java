import java.util.*;

public class AmbitiousKid_1866A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int mini=Integer.MAX_VALUE;
        while(n-- >0){
            int x=sc.nextInt();
            mini=Math.min(mini, Math.abs(x));
        }
        System.out.println(mini);
    }
}
