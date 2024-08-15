import java.util.Scanner;

public class j03007 {

    public static boolean isBeautifulNumber(String numb){

        int n = numb.length();

        if(numb.charAt(0)!='8' || numb.charAt(n-1)!='8') return false;

        for(int i = 0;i<=(n-1)/2;i++){
            if(numb.charAt(i)!= numb.charAt(n-i-1)) return false;
        }
        long sum = 0;
        for(int i = 0;i<n;i++){
            sum += Character.getNumericValue(numb.charAt(i));
        }
        if(sum%10!=0) return false;

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- > 0){

            String numb = scanner.nextLine();

            if(isBeautifulNumber(numb)) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
