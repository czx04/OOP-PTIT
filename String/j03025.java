

import java.util.*;

public class j03025 {

    public static boolean check(String s){
        int n = s.length();

        int checkkk = 0;
        for(int i = 0; i <= (n-1)/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)) checkkk++;
        }
        if((n%2==0 && checkkk ==1) || (n%2!=0 && checkkk <= 1)) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- > 0) {
            String s = scanner.nextLine();

            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
}

// Lưu ý:     số chữ số chẵn    abccda  d->b đối xứng
//            số chữ số lẻ      abcba    c -> mọi chữ khác thì cũng đối xứng