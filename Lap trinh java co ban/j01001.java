import java.util.Scanner;

public class j01001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        // Check for valid dimensions
        if (length <= 0 || width <= 0) {
            System.out.println(0);
        } else {
            // Calculate perimeter and area
            int perimeter = 2 * (length + width);
            int area = length * width;

            // Output results
            System.out.println(perimeter + " " + area);
        }

        scanner.close();
    }
}