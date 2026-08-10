import java.util.*;

public class PoliceRecruits_427A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int recruits=0;
        int crimes=0;
        while(n-->0){
            int x=sc.nextInt();
            if(x>=0){
                recruits+=x;
            }
            else{
                if(recruits>0){
                    recruits--;
                }
                else{
                    crimes++;
                }
            }
        }
        System.out.println(crimes);
        sc.close();
    }
}