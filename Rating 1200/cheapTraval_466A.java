import java.util.*;

public class cheapTraval_466A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int cnt=0;
        int rem=0;
        if(n>=m){
            int quo=n/m;
            rem=n%m;
            cnt+=quo*b;
        }
        int cnt2=cnt+b;
        if(rem>0){
            cnt+=rem*a;
        }
        if(cnt==0){
            System.out.println(Math.min(a*n, cnt2));
        }
        else{
            System.out.println(Math.min(cnt, Math.min(a*n, cnt2)));
        }
    }
}