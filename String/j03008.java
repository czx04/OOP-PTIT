
import java.util.Scanner;

public class j03008 {

    public static boolean isBeautifulNumber(String s) {
        int n = s.length();
        for(int i = 0;i<(n-1)/2;i++){
            int a = Character.getNumericValue(s.charAt(i));
            int b = Character.getNumericValue(s.charAt(n-i-1));
            if((a != 2 && a!= 3 && a!=5 && a!=7) || a!= b) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- >0){
            String numb = scanner.nextLine();

            if(isBeautifulNumber(numb)) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
