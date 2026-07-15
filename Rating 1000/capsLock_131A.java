import java.util.*;

public class capsLock_131A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            if(i == 0 && Character.isLowerCase(s.charAt(i))){
                System.out.print(Character.toUpperCase(s.charAt(i)));
            }else if(i > 0 && Character.isUpperCase(s.charAt(i))){
                System.out.print(Character.toLowerCase(s.charAt(i)));
            }else{
                System.out.print(s.charAt(i));
            }
        }
        sc.close();
    }
}