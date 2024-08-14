
import java.util.Arrays;
import java.util.Scanner;

public class j02005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] a = new int[m];
        int[] b = new int[n];
        int[] dd = new int[1005];
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            a[i] = x;
            dd[x] = 1;
        }
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            b[i] = x;
        }
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
                if(dd[b[i]]==1) {
                    System.out.printf("%d ",b[i]);
                    dd[b[i]] = 2;
                }
        }
        scanner.close();
    }
}
