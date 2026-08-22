import java.util.*;

public class I_love_username_155A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int minimum=Integer.MAX_VALUE;
        int maximum=Integer.MIN_VALUE;
        int cnt;
        ArrayList<Integer> list=new ArrayList<>();  
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            list.add(x);
        }
        if(list.get(0)>list.get(1)){
            cnt=1;
            maximum=list.get(0); 
            minimum=list.get(1);
        }
        else{
            cnt=1;
            maximum=list.get(1);
            minimum=list.get(0);
        }

        for(int i=1;i<n;i++){
            if(list.get(i)>maximum){
                cnt++;
                maximum=list.get(i);
            }
            else{
                if(list.get(i)<minimum){
                    cnt++;
                    minimum=list.get(i);
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}