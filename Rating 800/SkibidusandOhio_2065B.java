import java.util.*;

public class SkibidusandOhio_2065B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=s.length();
            int cnt=0;
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)==s.charAt(i+1))
                    cnt++;
            }
            System.out.println(n-cnt);
        }
    }
}