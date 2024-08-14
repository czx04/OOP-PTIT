
import java.util.Scanner;

public class j02006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[] a = new int[m];
        int[] b = new int[n];
        int[] dd = new int[1005];

        for (int i = 0; i < m; i++) {
            int x = scan.nextInt();
            a[i] = x;
            dd[x] = 1;
        }
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            b[i] = x;
            dd[x] = 1;
        }

        for (int i = 0; i <= 1000; i++) {
            if(dd[i] == 1) {
                System.out.printf(i + " ");
            }
        }
        


    }
}
