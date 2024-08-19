
import java.util.*;

public class J01018 {
    public static boolean checkk(String s) {
        long x = 0;
        for(int i = 0; i < s.length()-1;i++){
            if(Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i+1))) != 2) return false;
            x += Character.getNumericValue(s.charAt(i));
        }
        x += Character.getNumericValue(s.charAt(s.length()-1));
        if(x%10!=0) return false;
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
