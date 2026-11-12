import java.util.*;

public class BePositive_2149A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int negativeCount=0;
            int zeroCount=0;
            int postiveCount=0;
            int answer=0;
            for(int i=0;i<n;i++){
                if(arr[i]<0){
                    negativeCount++;
                }
                else if(arr[i]==0){
                    zeroCount++;
                }
                else{
                    postiveCount++;
                }
            }
            if(negativeCount%2==1){
                answer+=2;
            }
            answer+=zeroCount;
            System.out.println(answer);
        }
    }
}