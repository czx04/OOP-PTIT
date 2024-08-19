
import java.util.Scanner;

public class j03027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.nextLine();

        StringBuilder sb = new StringBuilder(a);
        boolean solve = true;

        while(solve) {
            solve = false;
            StringBuilder sb2 = new StringBuilder(sb);
            for (int i = 1; i < sb.length(); i++) {
                if(sb.charAt(i)==sb.charAt(i-1)) {
                    sb.delete(i-1, i+1);
                    solve = true;
                    break;
                }
            }

        }

        if(sb.length()==0) System.out.println("Empty String");
        else System.out.println(sb.toString());
    }
}
