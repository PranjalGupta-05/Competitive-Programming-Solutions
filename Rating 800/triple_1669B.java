import java.util.*;

public class triple_1669B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> count = new HashMap<>();
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
            }
            if(n<3){
                System.out.println(-1);
                return ;
            }
            for(int i = 0; i < n; i++) {
                if(count.get(arr[i]) >= 3 ) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        sc.close();
    }
}