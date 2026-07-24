import java.util.*;

public class helpfulMaths_339A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] parts = s.split("\\+");
        Arrays.sort(parts);
        for(int i = 0; i < parts.length; i++){
            System.out.print(parts[i]);
            if(i < parts.length - 1){
                System.out.print("+");
            }
        }
    }
}