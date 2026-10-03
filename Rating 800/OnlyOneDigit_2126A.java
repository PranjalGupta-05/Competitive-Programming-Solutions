import java.util.*;

public class OnlyOneDigit_2126A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int mini=Integer.MAX_VALUE;
            while(n>0){
                mini=Math.min(mini,n%10);
                n/=10;
            }
            System.out.println(mini);
        }
        sc.close();
    }
}