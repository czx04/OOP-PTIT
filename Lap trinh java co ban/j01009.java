import java.util.Scanner;

public class j01009 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        long sum = 1;
        long solve = 0;
        for(int i = 1;i<=n;i++){
            sum *= i;
            solve += sum;
        }
        System.out.print(solve);
    }
}
