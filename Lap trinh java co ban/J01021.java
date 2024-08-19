
import java.math.BigInteger;
import java.util.*;

public class J01021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        while(true){
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();

            if(a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO)) break;
            BigInteger d = new BigInteger("1000000007");
            BigInteger c = a.pow(b.intValue()).mod(d);

            System.out.println(c);
        }
    }
}

// chua AC
