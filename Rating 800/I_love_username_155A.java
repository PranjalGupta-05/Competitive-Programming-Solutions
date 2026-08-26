import java.util.*;

public class I_love_username_155A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(0);
            return;
        }
        ArrayList<Integer> list=new ArrayList<>();  
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            list.add(x);
        }
        int cnt=0;
        int maximum=list.get(0);
        int minimum=list.get(0);
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