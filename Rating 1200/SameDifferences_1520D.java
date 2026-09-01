import java.util.*;

public class SameDifferences_1520D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long cnt=0;
            Map<Integer, Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int diff=a-i;
                // If we've seen this difference before, it forms pairs with all previous occurrences
                int currentFreq=map.getOrDefault(diff, 0);
                cnt+=currentFreq;
                // Update the frequency for this difference
                map.put(diff, currentFreq + 1);
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}