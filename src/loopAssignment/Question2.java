package loopAssignment;
//- Write a program to enter the numbers till the user wants, the number can be positive,negative or zero. Calculate the sum of numbers until a negative number is encountered.
//        If the input is a negative number, current sum is discarded and print -1.
//        Cracking the Coding Interview in Java - Foundation

//        Input1:
//        2
//        48
//        0
//        6
//        -5
//        9
//        7
//        Output1:
//        -1
//        Input2:
//        0
//        2
//        6
//        1
//        4
//        0
//        output2
//        13
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int sum=0;

        while(sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x >= 0) {
                // for(int i=0;i>=num;i++) {
                sum = sum + x;
                System.out.println(sum);
                break;
                // }
            } else {
                sum = -1;
                System.out.println(sum);
                break;
            }
        }
        //System.out.println(sum);

    }
}
