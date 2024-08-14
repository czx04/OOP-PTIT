import java.util.Scanner;

public class j01002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read input
        int t = scanner.nextInt();
        while(t-- > 0){
            long n = scanner.nextInt();
            long s = n*(n+1)/2;
            System.out.println(s);
        }
    }
}