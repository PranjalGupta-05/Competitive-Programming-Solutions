import java.util.*;

public class SumofRoundNumbers_1352A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int count=0;
            StringBuilder result=new StringBuilder();
            for(int i=0;i<4;i++){
                int rem=n%10;
                if(rem!=0){
                    count++;
                    result.append(rem*(int)Math.pow(10,i)+" ");
                }
                n/=10;
            }
            System.out.println(count);
            System.out.println(result.toString());
        }
        sc.close();
    }
}