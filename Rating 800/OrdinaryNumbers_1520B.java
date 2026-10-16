import java.util.*;

public class OrdinaryNumbers_1520B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int count=0;
            for(int i=1;i<=9;i++){
                long currentOrdi=i;
                while(currentOrdi<=n){
                    count++;
                    currentOrdi=currentOrdi*10+i;
                }
            }
            System.out.println(count);
        }
    }
}