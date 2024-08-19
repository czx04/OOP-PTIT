
import java.util.*;

public class J01017 {
    public static boolean checkk(String s) {
        for(int i = 0; i < s.length()-1;i++){
            if(Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i+1))) != 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- > 0){
            String s = scanner.nextLine();
            if(checkk(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
