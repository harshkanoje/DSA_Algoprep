import java.util.Scanner;

public class Product_and_Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int multi = 1;

        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            multi = multi * lastdigit;
            n = n / 10;

        }
        System.out.println(multi - sum);
        sc.close();
    }
}
