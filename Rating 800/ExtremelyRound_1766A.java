import java.util.*;

public class ExtremelyRound_1766A{
    public static int isExtremelyRound(int n){
        String s=Integer.toString(n);
        int firtDigit=s.charAt(0)-'0';
        return 9*(s.length()-1)+firtDigit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            System.out.println(isExtremelyRound(n));
        }
    }
}