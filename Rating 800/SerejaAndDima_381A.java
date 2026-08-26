import java.util.*;

public class SerejaAndDima_381A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int sereja=0;
        int dima=0;
        int cnt=0;
        while(left<=right){
            if(cnt%2==0){
                if(arr[left]>arr[right]){
                    sereja+=arr[left];
                    left++;
                }
                else{
                    sereja+=arr[right];
                    right--;
                }

            }
            else{
                if(arr[left]>arr[right]){
                    dima+=arr[left];
                    left++;
                }
                else{
                    dima+=arr[right];
                    right--;
                }
            }
            cnt++;
        }
        System.out.println(sereja + " " + dima);
    }
}