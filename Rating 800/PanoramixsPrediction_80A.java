import java.util.*;

public class PanoramixsPrediction_80A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[m-n+1];
        int ind=0;
        for(int i=n+1;i<=m;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                arr[ind++]=i;
            }
        }
        if(arr[0]==m){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}