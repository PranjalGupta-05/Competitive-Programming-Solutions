import java.util.Scanner;

public class gameWithSticks_451A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if((n*m)%2 != 0 || n*m ==2 || n*m == 0){
            System.out.println("Akshat");
        } 
        else{
            System.out.println("Malvika");
        }
        sc.close();
    }
}