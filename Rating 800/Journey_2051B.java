import java.util.*;

public class Journey_2051B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n=sc.nextLong();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            long sum=(long)a+b+c;
            long k=n/sum;
            long rem=n%sum;
            long days=k*3;
            if(rem==0){
                System.out.println(days);
            }
            else if(rem<=a){
                System.out.println(days+1);
            }
            else if(rem<=a+b){
                System.out.println(days+2);
            }
            else{
                System.out.println(days+3);
            }
        }
    }
}