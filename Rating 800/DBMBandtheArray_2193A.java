import java.util.*;

public class DBMBandtheArray_2193A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int x=sc.nextInt();
            int sum=0;
            while(n-- >0){
                int val=sc.nextInt();
                sum+=val;
            }
            if(sum>s){
                System.out.println("NO");
            }
            else{
                if((s-sum)%x==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}