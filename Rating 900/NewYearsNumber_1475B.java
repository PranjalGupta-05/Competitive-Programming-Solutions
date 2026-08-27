import java.util.*;

public class NewYearsNumber_1475B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n<2020){
                System.out.println("NO");
            } 
            else{
                int rem=n%2020;
                int checkVal=2020*rem+rem;
                if(checkVal%2021==0 && checkVal/2021<=n/2020){
                    System.out.println("YES");
                } 
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}