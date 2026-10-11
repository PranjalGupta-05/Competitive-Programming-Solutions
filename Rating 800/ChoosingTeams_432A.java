import java.util.*;

public class ChoosingTeams_432A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt()+k;
            if(arr[i]<=5){
                count++;
            }
        }
        System.out.println(count/3);
    }
}