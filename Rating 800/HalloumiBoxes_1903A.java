import java.util.*;

public class HalloumiBoxes_1903A{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        
        while (t-- >0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            
            int[] a=new int[n];
            boolean isSorted=true;
            for(int i=0;i<n;i++){
                a[i]=scanner.nextInt();
                if (i>0 && a[i]<a[i-1]){
                    isSorted=false;
                }
            }
            if(k>=2 || isSorted){
                System.out.println("YES");
            } 
            else{
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}