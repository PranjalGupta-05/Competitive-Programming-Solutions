import java.util.Arrays;
import java.util.Scanner;

public class books_279B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int cnt=0;
        Arrays.sort(a);
        while(t>0){
            if(t>=a[cnt]){
                t-=a[cnt];
                cnt++;
            }else{
                break;
            }
        }
        System.out.println(cnt);
        scanner.close();
    }
}