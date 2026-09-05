import java.util.*;

public class OneZeroOne_2259C {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            if(a[0]==-1){
                a[0]=1;
            }
            if(a[n-1]==-1){
                a[n-1]=1;
            }
            int cnt=0;
            for(int i=0;i<n;i++){
                if(a[i]==1){
                    cnt++;
                }
                if(a[i]==-1 && cnt>0){
                    a[i]=0;
                }
                if(a[i]==-1 && cnt==0){
                    a[i]=1;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
