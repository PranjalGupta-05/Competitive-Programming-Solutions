import java.util.*;

public class Marenol_easyVersion_2254C1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int Aeven=0;
            int Aodd=0;
            int Beven=0;
            int Bodd=0;
            for(int i=0;i<n;i++){
                if(a.charAt(i)=='1'){
                    if(i%2==0){
                        Aeven++;
                    }
                    else{
                        Aodd++;
                    }
                }
                if(b.charAt(i)=='1'){
                    if(i%2==0){
                        Beven++;
                    }
                    else{
                        Bodd++;
                    }
                }
            }
            if(Aeven==Beven && Aodd==Bodd){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
