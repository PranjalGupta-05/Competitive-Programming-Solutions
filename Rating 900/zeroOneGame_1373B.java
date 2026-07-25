import java.util.Scanner;

public class zeroOneGame_1373B {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-- >0){
            String s=scanner.next();
            int zeros=0, ones=0;
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)=='1'){
                    ones++;
                } 
                else{
                    zeros++;
                }
            }
            int moves=Math.min(zeros, ones);
            if (moves%2!=0){ 
                System.out.println("DA");
            } 
            else {
                System.out.println("NET");
            }
        }
        scanner.close();
    }
}