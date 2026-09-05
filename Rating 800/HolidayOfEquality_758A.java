import java.util.*;

public class HolidayOfEquality_758A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(0);
        }
        else{
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(sc.nextInt());
            }
            int sum=0;
            for(int i:set){
                sum+=i;
            }
            System.out.println(sum);

        }
    }

}