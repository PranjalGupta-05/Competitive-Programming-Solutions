import java.util.*;

public class WordonthePaper_1850C{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int k=0;
            String ans="";
            while(k<8){
                String s=sc.next();
                for(int i=0;i<8;i++){
                    if(s.charAt(i)!='.'){
                        ans+=s.charAt(i);
                    }
                }
                k++;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}