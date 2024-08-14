import static java.lang.Math.sqrt;
import java.util.Scanner;

public class j01008 {
    public static void solve(int n){
        int x = n;
        int count = 0;
        while(x%2==0) {
            count++;
            x/=2;
        }
        if(count > 0) {
            System.out.printf("2(%d) ",count);
        }
        for(int i = 3; i<=sqrt(n);i+=2){
            count = 0;
            while(x%i==0){
                count++;
                x/=i;
            }
            if(count > 0) {
                System.out.printf("%d(%d) ",i,count);
            }
        }
        if(x!=1) System.out.printf("%d(1)",x);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 1;i<=t;i++){  
            int n = scan.nextInt();
            System.out.printf("Test %d: ",i);
            solve(n);
            System.out.println("");
        }
    }
}
