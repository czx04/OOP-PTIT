
import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int j = 1;j <= t; j++){
            
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] dd = new int[10001];
            for(int i = 0; i< n; i++){
                int x = scanner.nextInt();
                a[i] = x;
                dd[x]++;
            }
            System.out.printf("Test %d:\n",j);
            for(int i = 0; i< n; i++){
                if(dd[a[i]]!=0) 
                    System.out.printf("%d xuat hien %d lan\n",a[i],dd[a[i]]); 
                dd[a[i]] = 0;
            }


        }
    }
}
