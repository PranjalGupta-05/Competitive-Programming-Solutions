import java.util.Scanner;

public class zeroOneGame_1373B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int len=s.length();
            if(len%2==0){
                if((len/2)%2!=0){
                    System.out.println("DA");
                }
                else{
                    System.out.println("NET");
                }
            }
            else{
                if(((len-1)/2)%2!=0){
                    System.out.println("DA");
                }
                else{
                    System.out.println("NET");
                }
            }
        }
        scanner.close();
    }
}