import java.util.*;

public class VasyaandSocks_460A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int totalDays=n;
        while(n>=m){
            n-=m;
            totalDays++;
            n++;
        }
        System.out.println(totalDays);
    }
}