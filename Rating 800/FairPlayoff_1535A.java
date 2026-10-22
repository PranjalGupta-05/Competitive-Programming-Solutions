import java.util.*;

public class FairPlayoff_1535A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int firstfinalist=Math.max(a,b);
            int firstRunnerup=Math.min(a,b);
            int secondfinalist=Math.max(c,d);
            int secondRunnerup=Math.min(c,d);
            if(firstfinalist>secondRunnerup && secondfinalist>firstRunnerup){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}