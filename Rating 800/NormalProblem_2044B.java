import java.util.*;

public class NormalProblem_2044B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int strLen=s.length();
            String ans="";
            for(int i=strLen-1;i>=0;i--){
                if(s.charAt(i)=='p'){
                    ans+="q";
                }
                else if(s.charAt(i)=='q'){
                    ans+="p";
                }
                else{
                    ans+=s.charAt(i);
                    
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}