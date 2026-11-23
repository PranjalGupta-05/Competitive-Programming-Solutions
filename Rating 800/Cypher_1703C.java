import java.util.*;

public class Cypher_1703C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                String s=sc.next();
                int count=0;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)=='U'){
                        count--;
                    }
                    else{
                        count++;
                    }
                }
                arr[i]=(arr[i]+count)%10;
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}