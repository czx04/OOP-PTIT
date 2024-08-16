import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        String[] solve = new String[100];
        int k = 0;

        while(t-- > 0) {
            String s = scanner.nextLine().toLowerCase();
            String[] a = s.split("\\s+");

            // Lấy từ cuối cùng làm phần đầu của email
            StringBuilder sb = new StringBuilder(a[a.length-1]);

            // Thêm ký tự đầu của các từ khác vào sau phần đầu
            for(int i = 0; i < a.length - 1; i++) {
                sb.append(a[i].charAt(0));
            }

            solve[k++] = sb.toString();
        }

        for (int i = 0; i < k; i++) {
            int index = 1;
            for(int j = 0; j < i; j++) {
                if(solve[i].equals(solve[j])) {
                    index++;
                }
            }
            if(index == 1) {
                System.out.println(solve[i] + "@ptit.edu.vn");
            } else {
                System.out.println(solve[i] + index + "@ptit.edu.vn");
            }
        }
    }
}