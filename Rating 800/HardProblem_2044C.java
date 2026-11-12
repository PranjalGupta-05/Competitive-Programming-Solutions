import java.util.*;

public class HardProblem_2044C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int m=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int totalSeats=2*m;
            int firstRowSeats=m;
            int secondRowSeats=m;
            int totalMonkeySeated=0;
            int totalSeatsleft=totalSeats;
            int spaceLeftInFirstRow=firstRowSeats;
            int spaceLeftInSecondRow=secondRowSeats;
            if(a<=m && b<=m && a+b+c<=totalSeats){
                System.out.println(a+b+c);
                continue;
            }
            if(a>firstRowSeats){
                totalMonkeySeated+=firstRowSeats;
                spaceLeftInFirstRow=0;
            }
            else{
                totalMonkeySeated+=a;
                spaceLeftInFirstRow-=a;
            }
            if(b>secondRowSeats){
                totalMonkeySeated+=secondRowSeats;
                spaceLeftInSecondRow=0;
            }
            else{
                totalMonkeySeated+=b;
                spaceLeftInSecondRow-=b;
            }
            if(c>spaceLeftInFirstRow+spaceLeftInSecondRow){
                totalMonkeySeated+=spaceLeftInFirstRow+spaceLeftInSecondRow;
            }
            else{
                totalMonkeySeated+=c;

            }
            System.out.println(totalMonkeySeated);
        }
        sc.close();
    }
}