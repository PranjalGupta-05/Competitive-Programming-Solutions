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
            int maxi=Math.max(lastDigit, secondLastDigit);
            Character maxiChar=Integer.toString(maxi).charAt(0);
            String s=Integer.toString(num);
            String ans="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==maxiChar){
                    continue;
                } 
                else{
                    ans+=s.charAt(i);
                }
            }
            if(ans.equals("")){
                System.out.println(0);
            } else {
                System.out.println(ans);
            }
        }
    }
}
