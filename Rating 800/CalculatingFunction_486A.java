import java.util.*;

public class CalculatingFunction_486A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if(n%2==0){
            System.out.println(n/2);
        }
        else{
            System.out.println(-(n/2+1));
        }
    }
}