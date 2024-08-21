
import java.util.Scanner;

public class J03040 {
    public static boolean checkk(String a){
        if(a.charAt(0) == a.charAt(1) && a.charAt(1) == a.charAt(2) && a.charAt(4) == a.charAt(3)) return true;
        
        boolean a1 = true;
        boolean a2 = true;

        for (int i = 0; i < a.length()-1;i++){
            if(a.charAt(i) >= a.charAt(i+1)) {
                a1 = false;
                break;
            }
        }
        for (int i = 0; i < a.length();i++){
            if(a.charAt(i) != '6' && a.charAt(i) != '8') {
                a2 = false;
                break;
            }
        }

        return a1 || a2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- >0){
            String s = scanner.nextLine();

            String a = s.substring(5,8) + s.substring(9, 11);

            if(checkk(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
