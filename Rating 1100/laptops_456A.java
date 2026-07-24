import java.util.Scanner;

public class laptops_456A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        int[] quality = new int[n];
        int temp=n;
        int cnt=0;
        int input=0;
        while(temp-- >0){
            price[input] = sc.nextInt();
            quality[input] = sc.nextInt();
            input++;
        }
        for(int i=0;i<n-1;i++){
            if(price[i]<price[i+1] && quality[i]>quality[i+1]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        if(cnt>0){
            System.out.println("Happy Alex");
        }
        else{
            System.out.println("Poor Alex");
        }
    }
}