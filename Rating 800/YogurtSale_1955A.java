import java.util.*;

public class YogurtSale_1955A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int priceOf1=sc.nextInt();
            int priceOf2=sc.nextInt();
            int temp=n;
            if(n==1){
                System.out.println(priceOf1);
            }
            else{
                if(priceOf1*2>priceOf2){
                    int k=temp/2;
                    if(n%2==0){
                        System.out.println(k*priceOf2);
                    }
                    else{
                        System.out.println(k*priceOf2+priceOf1);
                    }
                }
                else{
                    System.out.println(n*priceOf1);
                }
            }
        }
        sc.close();
    }
}