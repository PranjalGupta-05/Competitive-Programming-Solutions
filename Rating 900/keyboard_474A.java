import java.util.Scanner;

public class keyboard_474A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append((char) (c - 32));
            } else {
                result.append(c);
            }
        }
        System.out.println(result.toString());
        scanner.close();
    }
}