import static java.lang.Math.sqrt;
import java.util.Scanner;

public class j1004 {

    public static boolean isP(int n){
        if(n<=1) return false;

        for(int i = 2;i<=sqrt(n);i++){
            if(n%i==0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while(t-- > 0) {
            int n = scanner.nextInt();
            if(isP(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
