import java.util.*;

public class Candies_1343A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n=sc.nextLong();
            long divisor=3; 
            while(n%divisor!=0){
                divisor=(divisor*2)+1; 
            }
            
            System.out.println(n/divisor);
        }
        sc.close();
            
    }
}
