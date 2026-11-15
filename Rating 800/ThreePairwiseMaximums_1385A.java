import java.util.*;

public class ThreePairwiseMaximums_1385A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(x==y && y==z){
                System.out.println("YES");
                System.out.println(x+" "+x+" "+x);
            }
            else if(x==y && x>=z){
                System.out.println("YES");
                System.out.println(x+" "+z+" "+z);
            }
            else if(y==z && y>=x){
                System.out.println("YES");
                System.out.println(y+" "+x+" "+x);
            }
            else if(z==x && z>=y){
                System.out.println("YES");
                System.out.println(z+" "+y+" "+y);
            }
            else{
                System.out.println("NO");
                
            }
        }
    }
}