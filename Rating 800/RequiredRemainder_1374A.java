import java.util.*;

public class RequiredRemainder_1374A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int n=sc.nextInt();
            int q=(n-y)/x;
            int k=(q*x)+y;
            System.out.println(k);
        }
        sc.close();
    }
}