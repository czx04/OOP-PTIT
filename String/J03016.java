
import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- > 0) {
            BigInteger a = new BigInteger(scanner.nextLine());
            BigInteger b = new BigInteger("11");
            if(a.mod(b).equals(BigInteger.ZERO))  System.out.println("1");
            else System.out.println("0");
        }
    }
}
