import java.util.*;

public class antonAndDanik_734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int anton=0,danik=0;
        String s=sc.next();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'){
                anton++;
            }
            else{
                danik++;
            }
        }
        if(anton>danik){
            System.out.println("Anton");
        }
        else if(danik>anton){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
        sc.close();
    }
}
