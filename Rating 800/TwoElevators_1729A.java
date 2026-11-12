import java.util.*;

public class TwoElevators_1729A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==1){
                System.out.println(1);
            }
            else if((Math.abs(b-c))<(a-1)){
                System.out.println(2);
            }
            else if((Math.abs(b-c))==(a-1)){
                System.out.println(3);
            }
        }
    }
}
