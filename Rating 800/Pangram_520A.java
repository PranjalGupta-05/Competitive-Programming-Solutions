import java.util.*;

public class Pangram_520A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s=scanner.next();
        if(n<26){
            System.out.println("NO");
            return;
        }
        s=s.toLowerCase();
        HashSet<Character> uniqueLetters=new HashSet<>();
        
        for(char c : s.toCharArray()){
            uniqueLetters.add(c);
        }
        if(uniqueLetters.size()==26){
            System.out.println("YES");
        } 
        else{
            System.out.println("NO");
        }
        scanner.close();
    }
}