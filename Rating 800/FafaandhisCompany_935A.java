import java.util.*;

public class FafaandhisCompany_935A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        for(int i=1;i<=n/2;i++){
            if((n-i)%i==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}