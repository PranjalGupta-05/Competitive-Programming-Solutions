import java.util.*;

public class Twins_160A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
       int totalSum = 0;
        for(int i=0;i<n;i++){
            int coin=sc.nextInt();
            arr.add(coin);
            totalSum+=coin; 
        }
        Collections.sort(arr);
        int mySum=0;
        int cnt=0;
        for(int i=n-1;i>=0;i--){
            mySum+=arr.get(i);
            cnt++; 
            if(mySum>totalSum/2){
                break;
            }
        }
        
        System.out.println(cnt);
        
    }
}