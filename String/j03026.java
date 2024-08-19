
import java.util.Scanner;

public class j03026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- >0){
            String a = scanner.nextLine();
            String b = scanner.nextLine();

            if(a.equals(b)) System.out.println("-1");
            else System.out.println(a.length() > b.length() ? a.length() : b.length());
        }
    }
}

// so sánh nếu 2 chuỗi giống nhau in -1
// 2 chuỗi khác nhau thì xâu con khác dài nhất bằng xâu dài hơn