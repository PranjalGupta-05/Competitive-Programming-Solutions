import java.util.*;

public class Presents_136A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            arr[x]=i;
        }
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}