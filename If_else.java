import java.util.*;

public class If_else {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // if else loops
        // Que 1
        int budget = scanner.nextInt();
        if (budget > 3000) {
            System.out.println("we are going to shimla ");
        } else {
            System.out.println("we are going to Redfort ('poor-no money')");
        }

        // Que 2
        int marks = scanner.nextInt();
        if (marks >= 35) {
            System.out.println("You passed the Examination");
        } else {
            System.out.println("You FAILED the Examination");
        }
        // Que 3
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

        // Clubing condition in if else
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if ((x % 2 == 0) || (y % 3 == 0)) {
            System.out.println("divisible ");

        } else {
            System.out.println("Not divisible ");
        }

        // if/ else if() /else [ no of conditions = no of blocks - 1]
        // syntax for if elseif
        // if (condn1){
        // //statement for if
        // } else if(condn2){
        // //statement for ifelse
        // } else if (condn3){
        // //statement for if
        // }else{
        // //statement for if
        // }

        // Que = greatest of three input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a >= b) && (a >= c)) {
            System.out.println(a);

        } else if ((b >= a) && (b >= c)) {
            System.out.println(b);
        } else if ((c >= a) && (c >= b)) {
            System.out.println(c);
        }

        // WHILE LOOP

        // que 1
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // que 2
        int p= 1;
        while (p <= 10) {
            System.out.println("i + " + (p- 1) + " = " + p);
            p= p + 2;
        }

    }

}
