import java.util.Scanner;
import java.util.Arrays;

public class increasing_1742B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean increasing = true;
            while(n-- > 0) {
                arr[n] = sc.nextInt();
            }
            Arrays.sort(arr);
            
            for(int i = 0; i < arr.length-1; i++) {
                if(arr[i]>=arr[i+1]) {
                    increasing = false;
                    break;
                }
            }
            if(increasing==true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
