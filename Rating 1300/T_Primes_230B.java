import java.util.Scanner;

public class T_Primes_230B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n-- >0){
            int divisorCnt=0;
            int num = scanner.nextInt();
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    divisorCnt++;
                }
            }
            if(divisorCnt==3){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}