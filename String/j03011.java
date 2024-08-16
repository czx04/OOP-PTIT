import java.math.BigInteger;
import java.util.Scanner;

public class j03011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine()); // Số lượng test case

        while (T-- > 0) {
            String a = scanner.nextLine(); // Đọc số a
            String b = scanner.nextLine(); // Đọc số b dưới dạng chuỗi

            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);

            // Lấy phần dư của b khi chia cho a
            BigInteger remainder = bigB.mod(bigA);

            // Tính GCD của a và remainder
            BigInteger gcd = bigA.gcd(remainder);

            // In kết quả
            System.out.println(gcd);
        }

        scanner.close();
    }
}