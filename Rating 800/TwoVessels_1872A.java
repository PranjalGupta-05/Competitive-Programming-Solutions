import java.util.*;

public class TwoVessels_1872A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            double needed=Math.abs(a-b)/2.0;
            int moves=(int)Math.ceil(needed/c);
            System.out.println(moves);
        }
    }
}