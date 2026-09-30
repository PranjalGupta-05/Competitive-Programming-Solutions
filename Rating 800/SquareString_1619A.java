import java.util.*;

public class SquareString_1619A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next();
            int n=s.length();
             boolean flag=false;
            if(n%2!=0){
                System.out.println("NO");
            }
            else{
                for(int i=0;i<n/2;i++){
                    if(s.charAt(i)==s.charAt((n/2)+i)){
                        flag=true;
                    }
                    else{
                        flag=false;
                        break;
                    }
                }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            } 
        }
        sc.close();
    }
}