import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();


    // Swapping numbers
    // assigning value of a to another variable


    int temp = a;

     a = b;
     b = temp;

    System.out.println(a);
    System.out.println(b);


    scn.close();
    }


}
