import java.util.*;

public class MakeAP_1624B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((b%a==0 && c%a==0) || (a%b==0 && c%b==0) || (a%c==0 && b%c==0)){
                System.out.println("YES");
            } 
            else{
                System.out.println("NO");
            }
        }
    }
}
