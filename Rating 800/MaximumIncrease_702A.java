import java.util.*;

public class MaximumIncrease_702A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxCnt=0;
        int cnt=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                cnt++;
            }
            else{
                maxCnt=Math.max(maxCnt,cnt);
                cnt=1;
            }
        }
        System.out.println(Math.max(maxCnt,cnt));
    }
}