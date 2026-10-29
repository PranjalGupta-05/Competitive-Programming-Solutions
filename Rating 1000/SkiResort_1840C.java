import java.util.*;

public class SkiResort_1840C{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int q=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x>=k){
                    arr[i]=1;
                } 
                else{
                    arr[i]=0;
                }
            }
            long cnt=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int sum=0;
                    for(int l=i;l<=j;l++){
                        sum+=arr[l];
                    }
                    if(sum>=q){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}