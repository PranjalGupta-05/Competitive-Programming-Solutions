import java.util.*;

public class OddGrasshopper_1607B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long x0=sc.nextInt();
            long n=sc.nextInt();
            long finalX=x0;
            long length=1;
            while(n-- >0){
                if(x0%2==1){
                    finalX-=length;
                }
                else{
                    finalX+=length;
                }
                length++;
            }
            System.out.println(finalX);
        }
    }
}