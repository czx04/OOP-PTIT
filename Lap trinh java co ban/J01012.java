
import static java.lang.Math.sqrt;
import java.util.*;

public class J01012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while(t-- >0){
            int n = scanner.nextInt();
            int solve = 0;
            if(n%2 == 0) solve++;
                for(int i = 2;i<=sqrt(n);i++){
                    if(n%i==0) {
                        if(i%2==0) solve++;
                        if((n/i)%2==0 && i != sqrt(n)) solve++;
                    }
                }
            System.out.println(solve);
            
        }
    }
}
