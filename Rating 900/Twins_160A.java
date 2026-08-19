import java.util.*;

public class Twins_160A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        int sum1=0;
        int sum2=0;
        int left=0;
        int right=n-1;
        while(left<right){
            sum1+=arr.get(left);
            sum2+=arr.get(right);
            left++;
            right--;
            if(sum2>sum1){
                System.out.println(n-right-1);
                return;
            }
            else if(sum1==sum2){
                System.out.println(n-right);
            }
        }
        
    }
}