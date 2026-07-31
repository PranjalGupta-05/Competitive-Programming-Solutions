import java.util.Scanner;

public class triple_1669B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] count = new int[n + 1];
            int ans = -1;
            
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                count[val]++; 
                if (count[val] >= 3) {
                    ans = val;
                }
            }
            System.out.println(ans);
        }
        
        sc.close();
    }
}