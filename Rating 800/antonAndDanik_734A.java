import java.util.*;

public class antonAndDanik_734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int anton=0,danik=0;
        while(n-- >0){
            Character c=sc.next().charAt(0);
            if(c=='A'){
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
