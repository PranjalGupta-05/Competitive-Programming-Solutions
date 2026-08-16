import java.util.*;

public class Puzzles_337A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int stu=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        
        int minDiff=Integer.MAX_VALUE;
        for (int i=0;i<=n-stu;i++){
            int currentDiff=arr[i+stu-1]-arr[i];
            if (currentDiff<minDiff){
                minDiff=currentDiff;
            }
        }
        System.out.println(minDiff);
        sc.close();
    }
}