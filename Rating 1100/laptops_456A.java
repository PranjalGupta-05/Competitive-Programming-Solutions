import java.util.Arrays;
import java.util.Scanner;

public class laptops_456A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[][] laptops=new int[n][2];
        
        for (int i=0;i<n;i++){
            laptops[i][0]=sc.nextInt(); 
            laptops[i][1]=sc.nextInt(); 
        }
        Arrays.sort(laptops,(a,b)->Integer.compare(a[0], b[0]));
        for (int i=0;i<n-1;i++){
            if (laptops[i][1]>laptops[i+1][1]){
                System.out.println("Happy Alex");
                return;
            }
        }
        System.out.println("Poor Alex");
    }
}