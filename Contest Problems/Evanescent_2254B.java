import java.util.Scanner;

public class Evanescent_2254B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int slen=sc.nextInt();
            String s=sc.next();
            int block=1;

            for(int i=1;i<slen;i++){
                if(s.charAt(i)!=s.charAt(i-1)){
                    block++;
                }
            }
            int ans=block;
            for(int i=1;i<slen-1;i++){
                int currentBlock=block;
                if(s.charAt(i-1)==s.charAt(i+1) && s.charAt(i)!=s.charAt(i-1)){
                    currentBlock=block-2;
                }
                else if(s.charAt(i)!=s.charAt(i-1) && s.charAt(i)==s.charAt(i+1)){
                    currentBlock=block-1;
                }
                ans=Math.min(ans,currentBlock);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
