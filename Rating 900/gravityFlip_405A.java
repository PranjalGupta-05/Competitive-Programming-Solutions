import java.util.*;

public class gravityFlip_405A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cubes=new int[n];
        for (int i=0;i<n;i++){
            cubes[i]=scanner.nextInt();
        }
        Arrays.sort(cubes);
        for (int cube : cubes){
            System.out.print(cube + " ");
        }
    }
}