import java.util.*;

public class MakeitWhite_1927A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            String s=sc.next();
            int leftB=0;
            int rightB=n-1;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='B'){
                    leftB=i;
                    break;
                }
            }
            for(int i=n-1;i>=0;i--){
                if(s.charAt(i)=='B'){
                    rightB=i;
                    break;
                }
            }
            System.out.println(rightB-leftB+1);
        }
    }
}