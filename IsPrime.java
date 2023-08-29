import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }

        if (count == 2) {
            System.out.println("Yay");
        } else {
            System.out.println("Nay");
        }

        // System.out.println(count);
        scanner.close();
    }

}
