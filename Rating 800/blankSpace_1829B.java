import java.util.*;

public class blankSpace_1829B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int cnt=0;
            int maxi=0;
            while(n-->0){
                int a=sc.nextInt();
                if(a==0){
                    cnt++;
                }else{
                    cnt=0;
                }
                maxi=Math.max(maxi,cnt);
            }
            System.out.println(maxi);
        }
    }
}