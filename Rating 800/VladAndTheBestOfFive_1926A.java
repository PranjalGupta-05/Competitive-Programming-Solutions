import java.util.Scanner;

public class VladAndTheBestOfFive_1926A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            String s=sc.next();
            int cnt=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='A'){
                    cnt++;
                }
                else{
                    cnt--;
                }
            }
            if(cnt>0){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
        sc.close();
    }
}