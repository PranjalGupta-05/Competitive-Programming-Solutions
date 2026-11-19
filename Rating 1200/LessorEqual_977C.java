import java.util.*;

public class LessorEqual_977C{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int l=0,r=n-1;
        while(l<r){
            int mid=(l+r+1)/2;
            if(arr[mid]<=k){
                l=mid;
            }
            else{
                r=mid-1;
            }
        }
        System.out.println(l+1);
    }
}