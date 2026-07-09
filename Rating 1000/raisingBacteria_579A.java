import java.util.Scanner;

public class raisingBacteria_579A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int bacteriaCount=0;
        while(n>0){
            if(n%2==1){
                bacteriaCount++;
            }
            n/=2;
        }
        System.out.println(bacteriaCount);
        sc.close();
    }
}