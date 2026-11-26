import java.util.*;

public class OneDEraser_1873D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int count=0;
            for(int i=0;i<n;i++){
                int temp=0;
                while(temp<k){
                    
                    if(s.charAt(temp)=='B'){
                        count++;
                        break;
                    }
                    temp++;
                }
                i=i+k;
            }
            System.out.println(count);
        }
    }
}