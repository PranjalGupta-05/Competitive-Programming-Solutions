import java.util.*;

public class Sale_34B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ProfitCost=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        int k=0;
        while(m-- >0){
            if(arr.get(k)<0){
                ProfitCost+=arr.get(k);
                k++;
            }
        }
        System.out.println(Math.abs(ProfitCost));
    }
}
