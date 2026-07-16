import java.util.Scanner;

public class capsLock_131A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();

        boolean isCapsLock=true;
        
        for(int i=1;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                isCapsLock=false;
                break;
            }
        }

        if (isCapsLock){
            char[] chars=s.toCharArray();
            for (int i=0;i<chars.length;i++){
                if(Character.isUpperCase(chars[i])){
                    System.out.print(Character.toLowerCase(chars[i]));
                } 
                else{
                    System.out.print(Character.toUpperCase(chars[i]));
                }
            }
            System.out.println();
        } 
        else{
            System.out.println(s);
        }
    }
}