import java.util.*;

public class Taxi_158B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int cntOf1=0;
        int cntOf2=0;
        int cntOf3=0;
        int cntOf4=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==1){
                cntOf1++;
            }
            else if(arr[i]==2){
                cntOf2++;
            }
            else if(arr[i]==3){
                cntOf3++;
            }
            else{
                cntOf4++;
            }
        }
        int minimumTaxi=0;
        minimumTaxi+=cntOf4;
        minimumTaxi+=cntOf3;
        if(cntOf1>cntOf3){
            cntOf1-=cntOf3;
        }
        else{
            cntOf1=0;
        }
        if(cntOf2%2==0){
            minimumTaxi+=cntOf2/2;
        }
        else if(cntOf2%2==1 && cntOf1>=2){
            minimumTaxi+=cntOf2/2;
            cntOf1-=2;
            minimumTaxi++;
        }
        else if(cntOf2%2==1 && cntOf1<2){
            minimumTaxi+=cntOf2/2;
            cntOf1=0; 
            minimumTaxi++;
        }
        minimumTaxi+=Math.ceil((double)cntOf2/2);
        System.out.println(minimumTaxi);
    }
}