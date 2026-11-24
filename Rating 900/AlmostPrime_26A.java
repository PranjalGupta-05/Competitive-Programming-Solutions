import java.util.*;

public class AlmostPrime_26A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] primeCnt=new int[n+1];
        for(int i=0;i<=n;i++){
            primeCnt[i]=0;
        }
        for(int i=2;i<=n;i++){
            if(primeCnt[i]==0){
                for(int j=i;j<=n;j+=i){
                    primeCnt[j]++;
                }
            }
        }
        int ansCnt=0;
        for(int i=1;i<=n;i++){
            if(primeCnt[i]==2){
                ansCnt++;
            }
        }
        System.out.println(ansCnt);
    }
}
