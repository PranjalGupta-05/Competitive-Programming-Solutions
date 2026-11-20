import java.util.*;

public class Showering_1999C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int m=sc.nextInt();
            int[] a=new int[m+1];
            while(n-- >0){
                int l=sc.nextInt();
                int r=sc.nextInt();
                for(int i=l;i<=r;i++){
                    a[i]=1;
                }
            }
            int cnt=0;
            int maxCnt=0;
            for(int i=0;i<=m;i++){
                if(a[i]==0){
                    cnt++;
                }
                else{
                    maxCnt=Math.max(maxCnt,cnt+1);
                    cnt=0;
                }
            }
            maxCnt=Math.max(maxCnt,cnt);
            if(maxCnt>=s){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}