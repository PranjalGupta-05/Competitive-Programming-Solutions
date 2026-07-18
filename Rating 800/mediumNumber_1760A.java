import java.util.Scanner;

public class mediumNumber_1760A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int max=Math.max(a, Math.max(b, c));
            int min=Math.min(a, Math.min(b, c));
            int sum=a+b+c;
            int median=sum-max-min;
            System.out.println(median);
        }
        sc.close();
    }
}