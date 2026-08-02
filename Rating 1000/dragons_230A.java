import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class dragons_230A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        TreeMap<Integer, Integer> dragons = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            dragons.put(x, dragons.getOrDefault(x, 0) + y);
        }
        for (Map.Entry<Integer, Integer> dragon : dragons.entrySet()) {
            if (s > dragon.getKey()) {
                s += dragon.getValue();
            } else {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}