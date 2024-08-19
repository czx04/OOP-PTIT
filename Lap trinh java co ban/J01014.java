
import java.util.*;

public class J01014 {
    public static long solve(long n){
        long s = 1;
        for(long i = 2; i*i <= n; i++){
            while(n%i==0){
                if(i > s) s = i;
                n/=i;
            }
        }
        if(n > 1) s = n;
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            System.out.println(solve(n));
        }
    }
}
