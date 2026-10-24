import java.util.*;

public class ArraywithOddSum_1296A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int sum=0;
            while(n-- >0){
                int a=sc.nextInt();
                sum+=a;
            }
            if(sum%2==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}