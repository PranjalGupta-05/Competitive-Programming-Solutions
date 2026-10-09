import java.util.*;

public class ShortSort_1873A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String given="abc";
        while(t-- >0){
            String s=sc.next();
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=given.charAt(i%3)){
                    count++;
                }
            }
            if(count==3){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}