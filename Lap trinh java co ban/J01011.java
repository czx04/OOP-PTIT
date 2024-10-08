
import java.util.*;

public class J01011 {
    public static long gcd(long a, long b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            System.out.printf("%d %d\n",b/gcd(a,b)*a,gcd(a,b));


        }
    }
}
