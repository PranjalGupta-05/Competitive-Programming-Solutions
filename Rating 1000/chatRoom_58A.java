import java.util.*;

public class chatRoom_58A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.subSequence(0, s.length()).toString().contains("hello")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}