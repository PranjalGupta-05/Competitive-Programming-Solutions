import java.util.*;

public class EqualCandies_1676B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int sum=0;
            int mini=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                sum+=a;
                if(a<mini){
                    mini=a;
                }
            }
            System.out.println(sum-(mini*n));
        }
    }
}