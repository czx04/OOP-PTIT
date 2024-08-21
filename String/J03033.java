
import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- > 0) {
            BigInteger a = new BigInteger(scanner.nextLine());
            BigInteger b = new BigInteger(scanner.nextLine());

            System.out.println(a.divide(a.gcd(b)).multiply(b));

        }

    }
}
