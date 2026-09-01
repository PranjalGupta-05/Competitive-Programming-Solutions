import java.util.*;

public class SameDifferences_1520D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int cnt=0;
            Map<Integer, Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                int diff=x-i;
                if(map.containsKey(diff)){
                    cnt+=map.get(diff);
                    map.put(diff, map.get(diff)+1);
                }
                else{
                    map.put(diff, 1);
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}