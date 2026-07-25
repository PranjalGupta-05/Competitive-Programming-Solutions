import java.util.*;

public class translation_41A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2=sc.nextLine();
        String reversed = new StringBuilder(s2).reverse().toString();
        if(s.equals(reversed)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}