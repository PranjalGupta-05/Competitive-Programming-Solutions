import java.util.*;

public class RecoveringaSmallString_1931A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            char[] arr=new char[3];
            for(int i=2;i>=0;i--){
                int val=Math.min(26, n-i);
                arr[i]=(char)(val+'a'-1);
                n=n-val;
            }
            System.out.println(new String(arr));
        }
    }
}