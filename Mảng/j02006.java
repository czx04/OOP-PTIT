
import java.util.*;

public class j02006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while(t-- > 0){
            long n = scanner.nextLong();
            long m = (long)Math.sqrt(n);
            if(m*m==n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
