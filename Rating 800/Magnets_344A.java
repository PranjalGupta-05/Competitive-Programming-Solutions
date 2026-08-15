import java.util.Scanner;

public class Magnets_344A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String prevMag = scanner.next();
        int groups = 1;
        for (int i = 1; i < n; i++) {
            String currMag = scanner.next();
            if (!currMag.equals(prevMag)) {
                groups++;
            }
            prevMag = currMag;
        }
        System.out.println(groups);
        
        scanner.close();
    }
}
