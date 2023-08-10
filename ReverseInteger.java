import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        while (n>0) {
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n=n/10;
    }
}

}