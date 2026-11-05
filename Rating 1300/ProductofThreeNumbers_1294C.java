import java.util.*;

public class ProductofThreeNumbers_1294C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a=-1, b=-1, c=-1;
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    a=i;
                    n/=a;
                    break;
                }
            }
            if(a!=-1){
                for(int i=a+1;i<Math.sqrt(n);i++){
                    if(n%i==0 && i!=a){
                        b=i;
                        c=n/b;
                        break;
                    }
                }
            }
            c=n;
            if(a!=-1 && b!=-1 && c>b){
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}