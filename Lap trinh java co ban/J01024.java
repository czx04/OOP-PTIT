
import java.util.*;

public class J01024 {
    public static boolean checkk(String x){
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i) != '0' && x.charAt(i) != '1' && x.charAt(i) != '2') return false;
        }
            return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        int t = Integer.parseInt(scanner.nextLine());
        while(t-- >0){
            String x = scanner.nextLine();
            if(checkk(x)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
