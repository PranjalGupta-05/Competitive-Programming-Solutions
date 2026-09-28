import java.util.*;

public class Legs_1996A{
    static int Legs(int n){
        if(n%4==0){
            return n/4;
        }
        else{
            return (n/4)+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            System.out.println(Legs(n));
        }
        sc.close();
    }
}