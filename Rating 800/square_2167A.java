import java.util.Scanner;

public class square_2167A {

    static class Square{
        private int a;
        private int b;
        private int c;
        private int d;

        public int getA() {
            return a;
        }
        public int getB() {
            return b;
        }
        public int getC() {
            return c;
        }
        public int getD() {
            return d;
        }
    }
    public static void main(String[] args) {
        Square obj = new Square();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n-- > 0){
            obj.a = sc.nextInt();
            obj.b = sc.nextInt();
            obj.c = sc.nextInt();
            obj.d = sc.nextInt();
            if(obj.getA() == obj.getB() && obj.getB() == obj.getC() && obj.getC() == obj.getD()){
                System.out.println("Yes");
            } 
            else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}