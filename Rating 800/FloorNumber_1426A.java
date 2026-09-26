import java.util.*;

public class FloorNumber_1426A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int ans=1;
            if(n==1 || n==2){
                System.out.println(ans);
            }
            else{
                int quo=(n-2)/x;
                int rem=(n-2)%x;
                ans+=quo;
                if(rem==0){
                    System.out.println(ans);
                }
                else{
                    System.out.println(ans+1);
                }
            }
        }
        sc.close();
    }
}