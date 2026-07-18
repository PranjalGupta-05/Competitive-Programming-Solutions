import java.util.*;

public class wordCapitalization_281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(i==0){
                ans+=Character.toUpperCase(s.charAt(i));
            }else{
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}