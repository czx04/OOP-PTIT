
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();

        Set<Character> set = new HashSet<>();
        
        for(int i = 0;i<s.length();i++){
            set.add(s.charAt(i));
        }

        System.out.println(set.size());
    }
}
