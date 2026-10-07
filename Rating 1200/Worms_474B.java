import java.util.*;

public class Worms_474B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        arr[0]=sc.nextInt();
        for(int i=1;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x+arr[i-1];
        }
        int m=sc.nextInt();
        while(m-->0){
            int x=sc.nextInt();
            int l=0,r=n-1;
            while(l<r){
                int mid=(l+r)/2;
                if(arr[mid]<x) l=mid+1;
                else r=mid;
            }
            System.out.println(l+1);
        }
    }
}