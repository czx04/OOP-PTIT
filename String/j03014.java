import java.math.BigInteger;
import java.util.Scanner;

public class j03014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            BigInteger aBig = scanner.nextBigInteger();
            BigInteger bBig = scanner.nextBigInteger();
            String c = aBig.add(bBig).abs().toString();
            System.out.println(c);
    }
}
