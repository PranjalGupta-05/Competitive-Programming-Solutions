import java.util.*;

public class Chemistry_1883B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            Map<Character,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            int oddCnt=0;
            for(Map.Entry<Character,Integer> entry:map.entrySet()){
                if(entry.getValue()%2==0){
                    continue;
                }
                else{
                    oddCnt++;
                }
            }
            if(k >= oddCnt - 1){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }
    }
}