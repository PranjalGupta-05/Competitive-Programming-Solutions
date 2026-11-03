import java.util.*;

public class HonestCoach_1360B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
                int[] s=new int[n];
                for(int i=0;i<n;i++){
                    s[i]=sc.nextInt();
                }
                Arrays.sort(s);
                int minDiff=Integer.MAX_VALUE;
                for(int i=1;i<n;i++){
                    int diff=s[i]-s[i-1];
                    if(diff<minDiff){
                        minDiff=diff;
                    }
                }
                System.out.println(minDiff);
        }
    }
}
