import java.util.*;

public class BrainsPhotos_707A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        boolean coloured=false;
        while(n-- >0){
            while(m-- >0){
                char ch = sc.next().charAt(0);
                if(ch=='C' || ch=='M' || ch=='Y'){
                    coloured=true;
                }
            }
        }
        if(coloured){
            System.out.println("#Color");
        }else{
            System.out.println("#Black&White");
        }
    }
}