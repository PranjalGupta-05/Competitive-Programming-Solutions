import java.util.Scanner;

public class myFirstSortingProblem_1971A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b){
                System.out.print(b);
                System.out.print(" ");
                System.out.println(a);
            }
            else{
                System.out.print(a);
                System.out.print(" ");
                System.out.println(b);
            }
        }
        sc.close();
    }
}