import java.util.*;

public class AplusB_1772A {

    static class xyz{
           private int a;
           private int b;

           public int getA() {
               return a;
           }

           public int getB() {
               return b;
           }
        }
    public static void main(String[] args) {
        xyz obj = new xyz();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String exp= sc.next();
            obj.a=exp.charAt(0)-'0';
            obj.b=exp.charAt(2)-'0';
            System.out.println(obj.getA()+obj.getB());
        }
        sc.close();
    }
}