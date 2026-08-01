import java.util.Scanner;

public class KefaandFirstSteps_580A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int cnt=1;  
        int maxCnt=1;
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                cnt++;
            }
            else{
                cnt=1;
            }
            maxCnt=Math.max(maxCnt,cnt);
        }
        System.out.println(maxCnt);
    }
}
