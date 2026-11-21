import java.util.*;

public class OddGrasshopper_1607B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-- >0){
            long x0=sc.nextLong();
            long n=sc.nextLong();
            long d=0;
            long rem=n%4;
            if(rem==1){
                d=-n;
            }else if(rem==2){
                d=1;
            } 
            else if(rem==3){
                d=n+1;
            }
            if(x0%2!=0){
                System.out.println(x0-d);
            } 
            else{
                System.out.println(x0+d);
            }
        }
    }
}