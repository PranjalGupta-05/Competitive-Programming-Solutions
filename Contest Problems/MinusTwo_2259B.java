import java.util.*;

public class MinusTwo_2259B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int oddCnt=0;
            int mod2Cnt=0;
            int mod0Cnt=0;  
            for (int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x%2!=0){
                    oddCnt++;
                } 
                else if(x%4==2){
                    mod2Cnt++;
                } 
                else{
                    mod0Cnt++;
                }
            }
            int ans = Math.max(oddCnt, Math.max(mod2Cnt, mod0Cnt));
            System.out.println(ans);
        }
    }
}