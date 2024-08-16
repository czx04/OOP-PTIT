
import java.math.BigInteger;
import java.util.Scanner;

public class j03012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- >0){
            BigInteger aBig = scanner.nextBigInteger();
            BigInteger bBig = scanner.nextBigInteger();
            String c = aBig.add(bBig).abs().toString();


            System.out.println(c);

        }

    }
}
