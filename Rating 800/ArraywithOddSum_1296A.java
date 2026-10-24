import java.util.*;

public class ArraywithOddSum_1296A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            boolean hasOdd=false;
            boolean hasEven=false;
            
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a%2!=0){
                    hasOdd=true;
                } 
                else{
                    hasEven=true;
                }
            }
            if(hasOdd && hasEven){
                System.out.println("YES");
            } 
            else if(hasOdd && n%2!=0){
                System.out.println("YES");
            } 
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}