import java.util.*;

public class Football_43A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,Integer> map=new HashMap<>();
        int temp=n;
        while(temp-- >0){
            String team=sc.next();
            if(map.containsKey(team)){
                map.put(team,map.get(team)+1);
            } else {
                map.put(team,1);
            }
        }
        String result="";
        for(String team:map.keySet()){
            if(map.get(team)>n/2){
                result+=team;
            }
        }
        System.out.println(result);
    }
}