import java.util.*;

public class InterestingDrink_706B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices=new int[n];
        for (int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        Arrays.sort(prices);
        int q=sc.nextInt();
        while(q-- >0){
            int pri=sc.nextInt();
            int l=0,r=n-1;
            while(l<r){
                int mid=(l+r)/2;
                if(prices[mid]<=pri){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
            System.out.println(l);
        }
    }
}