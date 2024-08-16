
import java.math.BigInteger;
import java.util.Scanner;

public class j03013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- >0){
            // String a = scanner.nextLine();
            // String b = scanner.nextLine();

            BigInteger aBig = scanner.nextBigInteger();
            BigInteger bBig = scanner.nextBigInteger();
            String c = aBig.subtract(bBig).abs().toString();
            String a = aBig.toString();
            String b = bBig.toString();
            int zero = a.length() > b.length() ? a.length() -  c.length() : b.length() - c.length();
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i<= zero; i++) {
                sb.append("0");
            }
            sb.append(c);

            System.out.println(sb.toString());

        }

    }
}
