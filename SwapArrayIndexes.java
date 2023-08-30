import java.util.Scanner;

public class SwapArrayIndexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sp = sc.nextInt();
        int ep = sc.nextInt();
        swap(arr, sp, ep);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }

    public static void swap(int arr[], int sp, int ep) {

        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;

            sp++;
            ep--;

        }

    }
}
