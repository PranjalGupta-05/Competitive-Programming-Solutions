import java.util.*;

public class Odd_EvenIncrements_1669C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean flag=true;
            int lastOddplace=arr[1];
            int lastEvenplace=arr[0];
            for(int i=2;i<n;i++){
                if(i%2==0){
                    if(arr[i]!=lastEvenplace){
                        flag=false;
                        break;
                    }
                }
                else{
                    if(arr[i]!=lastOddplace){
                        flag=false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}