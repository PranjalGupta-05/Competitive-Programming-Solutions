import java.util.*;

public class GoodKid_1873B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int mini=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                mini=Math.min(mini,arr[i]);
            }
            long maxProd=1;
            int cnt=0;
            for(int i=0;i<n;i++){
                if(arr[i]==mini && cnt==0){
                    maxProd*=(arr[i]+1);
                    cnt++;
                }
                else{
                    maxProd*=arr[i];
                }
            }
            System.out.println(maxProd);
        }
        sc.close();
    }
}