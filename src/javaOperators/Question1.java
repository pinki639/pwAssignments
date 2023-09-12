package javaOperators;
//Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
//        is taken with 5 and then multiply the resultant value by 5. Display the final result.
//        Input: 2345
//        Output: 20
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        x=x+8;
        x=x/3;
        x=x%5;
        x=x*5;
        System.out.println(x);
    }
}
