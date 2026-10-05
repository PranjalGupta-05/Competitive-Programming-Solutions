import java.util.*;

public class OddQueries_1807D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int q=sc.nextInt();
            int[] arr=new int[n+1];
            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
            }
            while(q-- > 0){
                int l=sc.nextInt();
                int r=sc.nextInt();
                int k=sc.nextInt();
                int sum=0;
                for(int i=1;i<=n;i++){
                    if(i>=l && i<=r){
                        sum+=k;
                    }
                    else{
                        sum+=arr[i];
                    }
                }
                if(sum%2==0){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
    }
}