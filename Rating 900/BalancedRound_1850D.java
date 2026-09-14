import java.util.*;

public class BalancedRound_1850D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int cnt=1;
            int maxCnt=1;
            for(int i=0;i<n-1;i++){
                if(Math.abs(arr[i]-arr[i+1])<=k){
                    cnt++;
                }
                else{
                    maxCnt=Math.max(maxCnt,cnt);
                    cnt=1;
                }
            }
            maxCnt=Math.max(maxCnt,cnt);
            System.out.println(n-maxCnt);
        }
        sc.close();
            
    }
}