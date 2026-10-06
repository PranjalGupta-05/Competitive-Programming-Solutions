import java.util.*;

public class FairDivision_1472B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int cntOf1=0;
            int cntOf2=0;
            for(int i=0;i<n;i++){
                int currNum=sc.nextInt();
                if(currNum==1){
                    cntOf1++;
                }
                else{
                    cntOf2++;
                }
            }
            int totalCoins=cntOf1+cntOf2;
            if(totalCoins%2==1){
                System.out.println("NO");
            }
            else{
                if(cntOf1%2==0 && cntOf2%2==0){
                    System.out.println("YES");
                }
                else{
                    if(cntOf2%2==1 && cntOf1%2==0 && cntOf1>0){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}