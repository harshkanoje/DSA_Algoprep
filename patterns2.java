import java.util.Scanner;


public class patterns2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int nst = 1;
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print(ans +" ");
                ans ++;
            }
            nst++;
            System.out.println();
        }
        scanner.close();
    }
}                       















































































































































































































