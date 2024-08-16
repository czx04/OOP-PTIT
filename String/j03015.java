
import java.math.BigInteger;
import java.util.Scanner;

public class j03015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            BigInteger aBig = scanner.nextBigInteger();
            BigInteger bBig = scanner.nextBigInteger();
            String c = aBig.subtract(bBig).toString();

            System.out.println(c);
    }
}
