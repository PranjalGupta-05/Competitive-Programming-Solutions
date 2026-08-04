import java.util.Scanner;

public class Tram_116A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            sum+=b-a;
            ans=Math.max(ans,sum);
        }
        System.out.println(ans);
    }
}
