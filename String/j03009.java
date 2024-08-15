import java.util.Arrays;
import java.util.Scanner;

public class j03009 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        while(t-- > 0) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();

            String[] aa = a.split(" ");
            String[] bb = b.split(" ");

            Arrays.sort(aa);

            boolean check1 = true;
            for(int j = 0; j< bb.length;j++) {
                if(aa[0].equals(bb[j])) check1 = false;
            }
            if(check1) System.out.print(aa[0] + " ");
            for(int i = 1;i< aa.length;i++) {
                boolean check = true;
                for(int j = 0; j< bb.length;j++) {
                    if(aa[i].equals(bb[j]) || aa[i].equals(aa[i-1])) check = false;
                }
                if(check) System.out.print(aa[i] + " ");
            }
            System.out.println("");
        }
    }
}
