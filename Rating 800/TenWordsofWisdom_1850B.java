import java.util.*;

public class TenWordsofWisdom_1850B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] wordsLen=new int[n];
            int[] quality=new int[n];
            for(int i=0;i<n;i++){
                wordsLen[i]=sc.nextInt();
                quality[i]=sc.nextInt();
            }
            int maxQuality=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(wordsLen[i]<=10){
                    maxQuality=Math.max(maxQuality, quality[i]);
                }
            }
            for(int i=0;i<n;i++){
                if(quality[i]==maxQuality){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}