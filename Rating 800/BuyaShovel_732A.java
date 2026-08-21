import java.util.*;

public class BuyaShovel_732A {
    public static int finder(int k, int r){
        int ans=0;
        for(int i=1;i<=10;i++){
            ans=k*i;
            if(ans%10==0 || ans%10==r){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(finder(k,r));
        sc.close();
    }
}