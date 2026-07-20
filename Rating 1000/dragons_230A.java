import java.util.Scanner;

public class dragons_230A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        while(n-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(s>x){
                s+=y;
            } 
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}