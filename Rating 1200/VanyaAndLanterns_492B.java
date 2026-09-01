import java.util.*;

public class VanyaAndLanterns_492B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        double maxDist=0;
        // Check the distance from the start of the street to the first lantern
        maxDist=Math.max(maxDist, arr[0]-0);
        // Check the distance from the last lantern to the end of the street
        maxDist=Math.max(maxDist, l-arr[n-1]);
        // Check distances between consecutive lanterns
        for(int i=1;i<n;i++){
            double dist=(arr[i]-arr[i-1])/2.0;
            maxDist=Math.max(maxDist, dist);
        }
        System.out.printf("%.10f\n", maxDist);
        sc.close();
    }
}