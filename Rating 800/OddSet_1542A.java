import java.util.*;

public class OddSet_1542A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int count=0;
            int totalElements=2*n;
            while(totalElements-- >0){
                int x=sc.nextInt();
                if(x%2==1){
                    count++;
                }
                else{
                    count--;
                }
            }
            if(count==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}