import java.util.*;

public class ilyaAndBankAccount_313A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println(num);
        } 
        else{
            int temp=-1*num;
            int lastDigit=temp%10;
            int secondLastDigit=(temp/10)%10;
            String s=Integer.toString(num);
            String ans;
            if(lastDigit>secondLastDigit){
                ans=s.substring(0, s.length()-1);
            } 
            else{
                ans=s.substring(0, s.length()-2)+s.substring(s.length()-1);
            }
            System.out.println(Integer.parseInt(ans));
        }
    }
}
