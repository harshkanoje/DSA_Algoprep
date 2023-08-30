// import java.math.*;
import java.util.Scanner;  // Import the Scanner class


public class Npr_Ncr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfactor = 1 ;
        for (int i=1; i<=n; i++) {
            nfactor =nfactor*i;
        }

        int rfactor =1;
        for (int i=1; i<=r; i++) {
            rfactor= rfactor * i;
        }

        int nmrfactor = 1 ;
        for (int i=1; i<=(n-r); i++) {
            nmrfactor = nmrfactor*i;
        } 

        int ncr = nfactor / (rfactor*nmrfactor);
        int npr = nfactor / (nmrfactor);
        

        System.out.println(nfactor);
        System.out.println(npr);
        System.out.println(ncr);
        sc.close();
    }
}
