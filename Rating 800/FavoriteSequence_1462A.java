import java.util.*;

public class FavoriteSequence_1462A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] result=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int left=0;
            int right=n-1;
            for(int i=0;i<n;i++){
                if(i%2==0){
                    result[i]=arr[left];
                    left++;
                }
                else{
                    result[i]=arr[right];
                    right--;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println();
        }
    }
}