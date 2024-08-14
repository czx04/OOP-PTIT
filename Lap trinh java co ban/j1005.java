
import java.util.Scanner;

public class j1005 {
    static long[] arrnumb = new long[94];
    public static void createar(){
        arrnumb[1] = 1;
        arrnumb[2] = 1;
        for(int i = 3; i <= 92; i++){
            arrnumb[i] = arrnumb[i-1] + arrnumb[i-2];
        }
    }
    public static void main(String[] args) {
        createar();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0){
            int n = scan.nextInt();
            System.out.println(arrnumb[n]);
        }
        scan.close();
    }
}
