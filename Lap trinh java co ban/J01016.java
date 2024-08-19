
import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int t = Integer.parseInt(scanner.nextLine());
        int t = 1;
        while(t-- >0){
            String s = scanner.nextLine();

            int solve = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='4'||s.charAt(i)=='7') solve++;
            }

            if(solve == 4 || solve == 7) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
