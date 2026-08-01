import java.util.Scanner;

public class keyboard_474A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String direction=scanner.next();
        String typed=scanner.next();
        char[] keyboard="qwertyuiopasdfghjkl;zxcvbnm,./".toCharArray();

        for (int i=0;i<typed.length();i++){
            char currentChar=typed.charAt(i);
            for(int j=0;j<keyboard.length;j++){
                if(keyboard[j]==currentChar){
                    if(direction.equals("R")){
                        System.out.print(keyboard[j-1]);
                    }
                    else{
                        System.out.print(keyboard[j+1]);
                    }
                    break;
                }
            }
        }
        System.out.println();
        scanner.close();
    }
}