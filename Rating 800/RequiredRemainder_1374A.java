import java.util.*;

public class RequiredRemainder_1374A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            System.out.println((n/b)*b+a);
        }
        sc.close();
    }
}