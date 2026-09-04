import java.util.*;

public class SoftDrinking_151A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, k, l, c, d, p, nl, np;
        n=sc.nextInt();
        k=sc.nextInt();
        l=sc.nextInt(); 
        c=sc.nextInt();
        d=sc.nextInt();
        p=sc.nextInt();
        nl=sc.nextInt();
        np=sc.nextInt();
        int totalDrink=k*l;
        int totalToasts=totalDrink/nl;
        int totalLimes=c*d;
        int enoughSalt=p/np;
        System.out.println((Math.min(totalToasts, Math.min(totalLimes, enoughSalt)))/n);
    }
}