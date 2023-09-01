// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class RotateArray {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        // int s = scn.nextInt();
        // int e = scn.nextInt();
        
        reversePart(arr);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    scn.close(); 

    }
    
    public static void reversePart(int[]arr){
        int sp = 0;
        int ep = arr.length-1;
        while(sp < ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
