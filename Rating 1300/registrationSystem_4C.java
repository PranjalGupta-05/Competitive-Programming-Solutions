import java.util.HashMap;
import java.util.Scanner;

public class registrationSystem_4C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String, Integer> userMap=new HashMap<>();
        while(n>0){
            String s=sc.next();
            if(!userMap.containsKey(s)){
                 System.out.println("OK");
                 userMap.put(s, 1);
            }
            else{
                int count=userMap.get(s);
                System.out.println(s+count);
                userMap.put(s, count+1);
            }
            n--;
        }
        sc.close();
    }
}