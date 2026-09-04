import java.util.*;

public class MishkaandGame_703A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        while(n-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                cnt++;
            } 
            else if(b>a){
                cnt--;
            }
        }
        if(cnt>0){
            System.out.println("Mishka");
        } 
        else if(cnt<0){
            System.out.println("Chris");
        } 
        else{
            System.out.println("Friendship is magic!^^");
        }
        sc.close();
    }
}