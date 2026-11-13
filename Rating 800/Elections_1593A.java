import java.util.*;

public class Elections_1593A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int maximum=Math.max(a,Math.max(b,c));
            int resA=0;
            int resB=0;
            int resC=0;
            if(a==b && b==c){
                System.out.println(1+" "+1+" "+1);
                continue;
            }
            if(maximum==a){
                resA=0;
                resB=maximum-b+1;
                resC=maximum-c+1;
            }
            else if(maximum==b){
                resB=0;
                resA=maximum-a+1;
                resC=maximum-c+1;
            }
            else{
                resC=0;
                resA=maximum-a+1;
                resB=maximum-b+1;
            }
            System.out.println(resA+" "+resB+" "+resC);
        }
    }
}
