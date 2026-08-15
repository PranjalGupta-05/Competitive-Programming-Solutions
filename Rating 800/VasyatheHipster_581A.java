import java.util.*;

public class VasyatheHipster_581A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int differentSocksDays=Math.min(a, b);
        int sameSocksDays=Math.abs(a-b)/2;
        System.out.println(differentSocksDays+" "+sameSocksDays);
        
        sc.close();
    }
}
