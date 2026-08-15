import java.util.*;

public class ThreeNumbersontheBlackboard_2256A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[3];
        while(n-- >0){
            int k=0;
            while(k<3){
                arr[k]=sc.nextInt();
                k++;
            }
            Arrays.sort(arr);
            if(arr[0]+arr[1]<arr[2]){
                System.out.println(arr[1]);
            }
            else{
                System.out.println(arr[2]-arr[0]);
            }
        }
    }
}