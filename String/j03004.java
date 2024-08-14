import java.util.Scanner;

public class j03004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- > 0) {
            String str = scanner.nextLine();

            str = str.trim().toLowerCase();

            String[] parts = str.split(" ");

            StringBuilder result = new StringBuilder();

            for (String part : parts) {
                if (!part.isEmpty()) {
                    result.append(Character.toUpperCase(part.charAt(0)))
                          .append(part.substring(1))
                          .append(" ");
                }
            }

            System.out.println(result.toString().trim());
        }
    }
}