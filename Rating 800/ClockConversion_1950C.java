import java.util.*;

public class ClockConversion_1950C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String time=sc.next();
            int h=Integer.parseInt(time.substring(0, 2));
            String m=time.substring(3, 5);
            String period=(h>=12) ? "PM" : "AM";
            int newH=h%12;
            if(newH==0){
                newH=12;
            }
            System.out.printf("%02d:%s %s\n", newH, m, period);
        }
    }
}
