import java.util.Scanner;

public class yetAnotherTwoIntegersProblem_1409A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- > 0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int difference = Math.abs(a - b);
        int cnt = difference / 10;
        if(difference % 10 != 0) {
            cnt++;
        }
        System.out.println(cnt);
    }
    sc.close();
    }
}
