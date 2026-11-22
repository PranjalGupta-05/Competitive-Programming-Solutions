import java.util.*;

public class Showering_1999C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int m=sc.nextInt();
            int prevEnd=0;
            boolean canShower=false;
            while(n-- >0){
                int l=sc.nextInt();
                int r=sc.nextInt();
                if(l-prevEnd>=s){
                    canShower=true;
                }
                prevEnd=r;
            }
            if(m-prevEnd>=s){
                canShower=true;
            }
            if(canShower){
                System.out.println("YES");
            }
             else{
                System.out.println("NO");
            }
        }
    }
}