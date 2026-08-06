import java.util.*;

public class GameWithIntegers_1899A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            int a=sc.nextInt();
            if(a%3==0){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
        sc.close();
    }
}