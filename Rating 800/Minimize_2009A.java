import java.util.Scanner;

public class Minimize_2009A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=(a+b)/2;
            System.out.println((c-a)+(b-c));
        }
        sc.close();
    }
}