import java.util.*;

public class ProblemGenerator_1980A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String s=sc.next();
            int[] freq=new int[7];
            for(int i=0;i<n;i++){
                freq[s.charAt(i)-'A']++;
            }
            int count=0;
            for(int i=0;i<7;i++){
                if(freq[i]>=m){
                    continue;
                }
                else{
                    count+=m-freq[i];
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}