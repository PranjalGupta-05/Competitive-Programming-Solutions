import java.util.*;

public class OneandTwo_1788A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int left=0;
            int right=n-1;
            int prodLeft=1;
            int prodRight=1;
            while(left<=right){
                prodLeft*=arr[left];
                prodRight*=arr[right];
                if(prodLeft==prodRight){
                    System.out.println(left);
                    break;
                }
                else if(prodLeft<prodRight){
                    left++;
                }
                else{
                    right--;
                }
            }
            if(left>right){
                System.out.println(-1);
            }
        }
    }
}