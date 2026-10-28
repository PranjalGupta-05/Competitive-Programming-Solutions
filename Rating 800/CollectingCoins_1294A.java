import java.util.*;

public class CollectingCoins_1294A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            int totalAvg=(a+b+c+n)/3;
            if(totalAvg>=a && totalAvg>=b && totalAvg>=c && (totalAvg-a)+(totalAvg-b)+(totalAvg-c)==n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}