import java.util.Scanner;

public class Riptide_2254A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int miniCnt=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            miniCnt+=Math.min(Math.abs(a-b),Math.min(Math.abs(b-c),Math.abs(c-a)));
            System.out.println(miniCnt);
        }
        sc.close();
    }
}
