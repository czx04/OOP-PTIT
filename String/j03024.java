
import java.util.Scanner;

public class j03024 {

    public static int isValidNumber(String number){
        int le = 0;
        int chan = 0;
        int length = number.length();

        for(int i = 0;i < length;i++){
            if(!Character.isDigit(number.charAt(i))) return 0;
            if(number.charAt(i) == '2' || number.charAt(i) == '4' || number.charAt(i) == '6' || number.charAt(i) == '8' || number.charAt(i) == '0') chan ++;
            else le++;
        }

        if(length %2 ==0 && chan > le) return 1;
        if(length %2 !=0 && chan < le) return 1;

        return 2;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- > 0){
            String num = scanner.nextLine();
            if(isValidNumber(num)== 1) System.out.println("YES");
            else if(isValidNumber(num)==2) System.out.println("NO");
            else System.out.println("INVALID");
        }
    }
}
