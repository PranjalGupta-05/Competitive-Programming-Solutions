import java.util.*;

public class VasilijeinCacak_1878C{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextInt();
            long k=sc.nextInt();
            long x=sc.nextInt();

            long minSum=k*(k+1)/2;
            long maxSum=k*(2*n-k+1)/2;
            if(x>=minSum && x<=maxSum){
                System.out.println("YES");
            } 
            else{
                System.out.println("NO");
            }
        }
    }
}