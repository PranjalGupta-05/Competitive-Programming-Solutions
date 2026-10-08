import java.util.*;

public class OddQueries_1807D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int q=sc.nextInt();
            long[] pref=new long[n+1];
            for(int i=1;i<=n;i++){
                int val=sc.nextInt();
                pref[i]=pref[i-1]+val;
            }
            while(q-- > 0){
                int l=sc.nextInt();
                int r=sc.nextInt();
                int k=sc.nextInt();
                long oldRangeSum=pref[r]-pref[l-1];
                long newRangeSum=(long)(r-l+1)*k;
                long totalSum=pref[n]-oldRangeSum+newRangeSum;
                // for(int i=1;i<=n;i++){
                //     if(i>=l && i<=r){
                //         sum+=k;
                //     }
                //     else{
                //         sum+=arr[i];
                //     }
                // }
                if(totalSum%2==0){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
    }
}