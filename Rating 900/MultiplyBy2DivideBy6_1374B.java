import java.util.*;

public class MultiplyBy2DivideBy6_1374B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int cnt1=0;
            int cnt2=0;
            while(n%2==0){
                cnt1++;
                n=n/2;
            }
            while(n%3==0){
                cnt2++;
                n=n/3;
            }
            if(n == 1 && cnt1<=cnt2){
                System.out.println(2*cnt2-cnt1);
            } 
            else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}