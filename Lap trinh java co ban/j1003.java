
import java.util.Scanner;

public class j1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a==0&&b==0) System.out.println("VSN");
        else if(a==0&&b!=0) System.out.println("VN");
        else {
            float c = - (float)b / a;
            System.out.printf("%.2f%n",c);
        }
        scanner.close();
    }
}