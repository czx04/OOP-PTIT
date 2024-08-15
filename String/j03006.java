
import java.util.Scanner;

public class j03006 {

    public static boolean isnicenumb(String numb){
        int n = numb.length();
        for(int i = 0;i<=(n-1)/2;i++){
            int a = Character.getNumericValue(numb.charAt(i));
            int b = Character.getNumericValue(numb.charAt(n-1-i));
            if(a%2!=0 || a!=b) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- > 0){
            String numb = scanner.nextLine();

            if(isnicenumb(numb)) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
