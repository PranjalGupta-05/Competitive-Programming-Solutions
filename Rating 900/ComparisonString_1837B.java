import java.util.*;

public class ComparisonString_1837B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            String s=sc.next();
            int maxLen=1;
            int currLen=1;
            for(int i=1;i<n;i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    currLen++;
                }else{
                    currLen=1;
                }
                maxLen=Math.max(maxLen,currLen);
            }
            System.out.println(maxLen+1);
        }
    }
}