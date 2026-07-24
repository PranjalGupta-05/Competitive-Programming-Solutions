import java.util.Arrays;
import java.util.Scanner;

public class cutRibbon_189A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[3];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        Arrays.sort(arr);
        int cnt=0;
        while(n>0){
            for(int i=0;i<3;i++){
                if(n>=arr[i]){
                    n-=arr[i];
                    cnt++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}