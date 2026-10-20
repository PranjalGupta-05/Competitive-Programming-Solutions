import java.util.*;

public class GrabtheCandies_1807B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int sum=0;
            while(n-- >0){
                int x=sc.nextInt();
                if(x%2==0){
                    sum+=x;
                }
                else{
                    sum-=x;
                }
            }
            if(sum>0){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}