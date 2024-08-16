import java.util.Scanner;

public class j03010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        String[] solve = new String[100];
        int k = 0;

        while(t-- > 0) {
            String s = scanner.nextLine().toLowerCase();

            String[] a = s.split("\\s+");

            solve[k] = a[a.length-1];

            for (int i = 0; i < a.length - 1; i++) {
                // if (!a[i].isEmpty()) {
                    solve[k] += a[i].charAt(0);
                // }
            }
            k++;
        }
        for (int i = 0; i < k; i++) {
            int index = 1;
            for(int j = 0;j<i;j++){
                if(solve[i].equals(solve[j])) index++;
            }
            if(index==1) System.out.println(solve[i] + "@ptit.edu.vn");
            else System.out.println(solve[i] + index + "@ptit.edu.vn");
        }
    }
}
