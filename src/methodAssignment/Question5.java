package methodAssignment;
//Write a Java method to find the smallest number among three numbers.
//
//        input1
//        25
//        37
//        29
//        output1
//        25
//input2
//        25
//        25
//        25
//        output2
//        25
import java.util.*;
public class Question5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the three numbers");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.print(smallest(a, b, c));
    }
    public static int smallest(int a, int b, int c){
        return Math.min(a, Math.min(b,c));
    }
}
