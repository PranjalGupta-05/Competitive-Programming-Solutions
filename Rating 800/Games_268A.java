import java.util.*;

public class Games_268A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arrA=new int[n];
        int[] arrB=new int[n];
        while(n-- >0){
            arrA[n]=sc.nextInt();
            arrB[n]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<arrA.length;i++){
            for(int j=0;j<arrB.length;j++){
                if(arrA[i]==arrB[j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
