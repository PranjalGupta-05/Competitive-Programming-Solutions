import java.util.*;

public class BossFight_2252A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        while(t-- >0){
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
            }
            int ans=arr.get(0);
            for(int i=1;i<n;i++){
                if(arr.get(i-1)==arr.get(i)){
                    ans+=arr.get(i);
                    break;
                }
                else{
                    ans+=arr.get(i);
                }
            }
            arr.clear();
            System.out.println(ans);
        }
    }
}
