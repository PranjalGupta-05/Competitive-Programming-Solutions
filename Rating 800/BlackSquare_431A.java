import java.util.*;

public class BlackSquare_431A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int a4=sc.nextInt();
        String s=sc.next();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                sum+=a1;
            }
            else if(s.charAt(i)=='2'){
                sum+=a2;
            }
            else if(s.charAt(i)=='3'){
                sum+=a3;
            }
            else{
                sum+=a4;
            }
        }
        System.out.println(sum);
    }
}