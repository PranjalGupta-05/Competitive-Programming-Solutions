import java.util.*;

public class AllDistinct_1692B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            Set<Integer> uniqueElements=new HashSet<>();
            for (int i=0;i<n;i++){
                uniqueElements.add(sc.nextInt());
            }
            
            int u=uniqueElements.size();
            if((n-u)%2!=0){
                System.out.println(u-1);
            } 
            else{
                System.out.println(u);
            }
            
        }
    }
}