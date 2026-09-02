import java.util.*;

public class MakeAP_1624B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            boolean isPossible = false;
            // Check if we can form an AP by multiplying 'a'
            int newA=2*b-c;
            if(newA>0 && newA%a==0){
                isPossible=true;
            } 
            // Check if we can form an AP by multiplying 'b'
            else if((a+c)%(2*b)==0){
                isPossible=true;
            } 
            // Check if we can form an AP by multiplying 'c'
            else{
                int newC=2*b-a;
                if(newC>0 && newC%c==0){
                    isPossible = true;
                }
            }
            if(isPossible){
                System.out.println("YES");
            } 
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
