import java.util.*;

public class PrependandAppend_1791C {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(); 
        
        while(t-- >0){
            int n=scanner.nextInt();
            String s=scanner.next();
            
            int left=0;
            int right=n-1;
            while(left<right && s.charAt(left)!=s.charAt(right)){
                left++;
                right--;
            }
            System.out.println(right-left+1);
        }
        scanner.close();
    }
}