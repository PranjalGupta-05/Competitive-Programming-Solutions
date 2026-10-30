import java.util.*;

public class ICPCBalloons_1703B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            String s=sc.next();
            HashMap<Character, Integer> map=new HashMap<>();
            int sum=0;
            for(char ch:s.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            for(Map.Entry<Character, Integer> entry:map.entrySet()){
                if(entry.getValue()>0){
                    sum+=2+(entry.getValue()-1)*1;
                }
            }
            System.out.println(sum);
        }
    }
}