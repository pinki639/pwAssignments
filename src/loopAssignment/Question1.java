package loopAssignment;
//Q 1 - Write a program to print Fibonacci series of n terms where n is input by user.
//        Input1:
//        6
//        Output1:
//        1 1 2 3 5 8
//        Input2:
//        2
//        Output2
//        11
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=1;
        int b=1;
        for(int i=1;i<=x;i++){
            System.out.print(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}
