import java.util.Scanner;

public class petya_and_Strings_112A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();

        String lowerStr1=str1.toLowerCase();
        String lowerStr2=str2.toLowerCase();

        int comparisonResult=lowerStr1.compareTo(lowerStr2);

        if(comparisonResult<0){
            System.out.println("-1");
        } 
        else if(comparisonResult>0){
            System.out.println("1");
        } 
        else{
            System.out.println("0");
        }
        scanner.close();
    }
}