import java.util.Scanner;
import java.util.Arrays;

public class spell_Check_1722A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        char[] name={'T', 'i', 'm', 'u', 'r'};
        Arrays.sort(name);
        while(t>0){
            int n=sc.nextInt();
            String s=sc.next();
            if(n!=5){
                System.out.println("NO");
            } 
            else{
                char[] arr=s.toCharArray();
                Arrays.sort(arr);
                
                if(Arrays.equals(name, arr)) {
                    System.out.println("YES");
                } 
                else{
                    System.out.println("NO");
                }
            }
            t--;
        }
        sc.close();
    }
}