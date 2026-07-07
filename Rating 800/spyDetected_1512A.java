import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class spyDetected_1512A{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while(n>0){
            int t=scanner.nextInt();
            int[] arr=new int[t];
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for(int i=0;i<t;i++){
                arr[i]=scanner.nextInt();
                frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
            }
            for(int i=0;i<t;i++){
                if(frequencyMap.get(arr[i])==1){
                    System.out.println(i+1);
                    break;
                }
            }
            n--;
        }
        scanner.close();
    }
}