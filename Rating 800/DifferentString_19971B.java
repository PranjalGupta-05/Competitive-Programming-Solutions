import java.util.*;

public class DifferentString_19971B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=s.length();
            char[] arr=s.toCharArray();
            boolean found=false;
            if(n<2){
                System.out.println("No");
            }
            else{
                for(int i=0;i<n-1;i++){
                    if(arr[i]!=arr[i+1]){
                        System.out.println("Yes");
                        char temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                        String newString=new String(arr);
                        System.out.println(newString);
                        found=true;
                        break;
                    }
                }
                if(!found){
                    System.out.println("No");
                }
            }
        }
    }
}