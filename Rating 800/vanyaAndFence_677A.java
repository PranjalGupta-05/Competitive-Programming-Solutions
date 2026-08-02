import java.util.Scanner;

public class vanyaAndFence_677A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int width = 0;
        while(n-- > 0){
            int height = sc.nextInt();
            if(height > h){
                width += 2;
            } else {
                width += 1;
            }
        }
        System.out.println(width);
        sc.close();
    }
}