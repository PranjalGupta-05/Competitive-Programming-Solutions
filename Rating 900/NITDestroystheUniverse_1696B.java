import java.util.*;

public class NITDestroystheUniverse_1696B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int ans=0;
            int l=-1;
            int r=-1;
            for(int i=0;i<n;i++){
                if(a[i]!=0){
                    if(l==-1){
                        l=i;
                    }
                    r=i;
                }
                else if(a[i]==0){
                    if(l!=-1){
                        for(int j=l;j<=r;j++){
                            if(a[j]!=0){
                                a[j]=0;
                            }
                        }
                        ans++;
                        l=-1;
                        r=-1;
                    } 
                }
            }
            if(l!=-1){
                for(int j=l;j<=r;j++){
                    if(a[j]!=0){
                        a[j]=0;
                    }
                }
                ans++;
            }
            System.out.println(ans);
        }
    }
}