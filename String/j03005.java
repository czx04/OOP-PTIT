
import java.util.Scanner;

public class j03005 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- > 0) {
            String name = scanner.nextLine();

            name = name.trim().toLowerCase();

            String[] parts = name.split(" ");

            StringBuilder solve = new StringBuilder();
            

            for(String part : parts) {
                if(!part.isEmpty() && part != parts[0]) {
                solve.append(Character.toUpperCase(part.charAt(0)))
                    .append(part.substring(1))
                    .append(" ");
                }
            }
            solve.deleteCharAt(solve.length()-1).append(", ").append(parts[0].toUpperCase());
            
            String result = solve.toString().trim();

            System.out.println(result);

        }
    }
}
