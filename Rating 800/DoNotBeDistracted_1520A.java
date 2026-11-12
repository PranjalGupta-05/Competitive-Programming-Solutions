import java.util.*;

public class DoNotBeDistracted_1520A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            String s=sc.next();
            boolean isSuspicious=false;
            Set<Character> seenTasks=new HashSet<>();
            char previousTask=' ';
            for(int i=0;i<n;i++){
                char currentTask=s.charAt(i);
                if(currentTask!=previousTask){
                    if(seenTasks.contains(currentTask)){
                        isSuspicious=true;
                        break;
                    }
                    seenTasks.add(currentTask);
                    previousTask=currentTask;
                }
            }
            
            if(isSuspicious){
                System.out.println("NO");
            } 
            else{
                System.out.println("YES");
            }
        }
    }
}