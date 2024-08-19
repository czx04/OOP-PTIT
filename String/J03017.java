
import java.util.*;

public class J03017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while(t-- > 0) {
            String s = scanner.nextLine();

            StringBuilder sb = new StringBuilder(s);
            long n = sb.length();
            boolean check = true;

            while(check){
                check = false;
                for(int i = 0;i < sb.length() - 2;i++){
                    if(sb.charAt(i)=='1'&&sb.charAt(i+1)=='0'&&sb.charAt(i+2)=='0'){
                        sb.delete(i, i+3);
                        check = true;
                    }
                }
            }
            System.out.println(n - sb.length());
        }
    }
}
