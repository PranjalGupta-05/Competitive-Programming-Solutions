import java.util.*;

public class LoveStory_1829A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String correctWord="codeforces";
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next();
            int cnt=0;
            for(int i=0;i<correctWord.length();i++){
                if(s.charAt(i)!=correctWord.charAt(i)){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}