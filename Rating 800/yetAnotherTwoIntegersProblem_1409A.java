import java.util.Scanner;

// public class helper {
//     Scanner sc= new Scanner(System.in);
//     int t = sc.nextInt();
//     while(t>0){
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int cnt=0;
//         if(a==b){
//             System.out.println(0);
//         }
//         else if(a>b){
//             while(a!=b){
//                 if(a-b>=10){
//                     a-=10;
//                     cnt++;
//                 }
//                 else if(a-b==9){
//                     a-=9;
//                     cnt++;
//                 }
//                 else if(a-b==8){
//                     a-=8;
//                     cnt++;
//                 }
//                 else if(a-b==7){
//                     a-=7;
//                     cnt++;
//                 }
//                 else if(a-b==6){
//                     a-=6;
//                     cnt++;
//                 }
//                 else if(a-b==5){
//                     a-=5;
//                     cnt++;
//                 }
//                 else if(a-b==4){
//                     a-=4;
//                     cnt++;
//                 }
//                 else if(a-b==3){
//                     a-=3;
//                     cnt++;
//                 }
//                 else if(a-b==2){
//                     a-=2;
//                     cnt++;
//                 }
//                 else{
//                     a--;
//                     cnt++;
//                 }
//             }
//         }
//         else{
//             while(a!=b){
//                 if(b-a>=10){
//                     a+=10;
//                     cnt++;
//                 }
//                 else if(b-a==9){
//                     a+=9;
//                     cnt++;
//                 }
//                 else if(b-a==8){
//                     a+=8;
//                     cnt++;
//                 }
//                 else if(b-a==7){
//                     a+=7;
//                     cnt++;
//                 }
//                 else if(b-a==6){
//                     a+=6;
//                     cnt++;
//                 }
//                 else if(b-a==5){
//                     a+=5;
//                     cnt++;
//                 }
//                 else if(b-a==4){
//                     a+=4;
//                     cnt++;
//                 }
//                 else if(b-a==3){
//                     a+=3;
//                     cnt++;
//                 }
//                 else if(b-a==2){
//                     a+=2;
//                     cnt++;
//                 }
//                 else{
//                     a++;
//                     cnt++;
//                 }
//             }
//         }
//         t--;
//     }
//     System.out.println(cnt);
// }


public class yetAnotherTwoIntegersProblem_1409A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- > 0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int difference = Math.abs(a - b);
        int cnt = difference / 10;
        if(difference % 10 != 0) {
            cnt++;
        }
        System.out.println(cnt);
    }
    }
}
