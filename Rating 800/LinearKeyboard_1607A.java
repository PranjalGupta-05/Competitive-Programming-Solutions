import java.util.*;

public class LinearKeyboard_1607A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next();
            String str=sc.next();
            int ans=0;
            for(int i=1;i<str.length();i++){
                ans+=Math.abs(s.indexOf(str.charAt(i))-s.indexOf(str.charAt(i-1)));
            }
            System.out.println(ans);
        }
    }
}