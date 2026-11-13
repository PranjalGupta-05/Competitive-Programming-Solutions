import java.util.*;

public class Rook_1907A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String pos=sc.next();
            int x=pos.charAt(0)-'a'+1;
            int y=pos.charAt(1)-'0';
            for(int i=1;i<=8;i++){
                System.out.println((char)('a'+i-1)+""+y);
            }
        }
    }
}
