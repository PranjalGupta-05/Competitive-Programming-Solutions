import java.util.Scanner;

public class codeforcesChecking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String word="codeforces";
        while(n>0){
            String s = scanner.next();
            if(word.contains(s)){
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
            n--;
        }
    }
}