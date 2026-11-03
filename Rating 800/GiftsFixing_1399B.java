import java.util.*;

public class GiftsFixing_1399B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            int minA=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                minA=Math.min(minA,a[i]);
            }
            int minB=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
                minB=Math.min(minB,b[i]);
            }
            long totalMoves=0;
            for(int i=0;i<n;i++){
                totalMoves+=Math.max(a[i]-minA,b[i]-minB);
            }
            
            System.out.println(totalMoves);
        }
    }
}