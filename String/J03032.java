
import java.util.*;

public class J03032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- >0){
            String line = scanner.nextLine();

            String[] parts = line.split("\\s+");


            for(String part : parts){
                StringBuilder sb = new StringBuilder(part);

                sb.reverse();

                System.out.print(sb.toString() + " ");
            }
            System.out.println("");
        }
    }
}
