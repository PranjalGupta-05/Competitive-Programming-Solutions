import java.util.Scanner;

public class dubstep_208A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String result=s.replaceAll("WUB", " ").trim().replaceAll("\\s+", " ");
        System.out.println(result);
        scanner.close();
    }
}