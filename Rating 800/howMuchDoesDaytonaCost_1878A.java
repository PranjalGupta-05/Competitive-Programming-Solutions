// import java.util.Scanner;

// public class howMuchDoesDaytonaCost_1878A {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t > 0) {
//             int n = sc.nextInt();
//             int m = sc.nextInt();
//             int[] arr = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             int k = -1;
//             for(int i=0;i<n;i++){
//                 if(arr[i] == m){
//                     k = i;
//                     break;
//                 }
//             }
//             if(k!=-1){
//                 System.out.println("Yes");
//             }
//             else{
//                 System.out.println("No");
//             }
//             t--;
//         }
//     }
// }


import java.util.Scanner;
public class howMuchDoesDaytonaCost_1878A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] == m){
                    cnt++;
                }
            }
            if(cnt > 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            t--;
        }
    }
}