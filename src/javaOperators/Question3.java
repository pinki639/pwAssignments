package javaOperators;
//Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
//        Input: 132
//        Output: 6
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        while(x>0){
            sum=sum+x%10;
            x=x/10;

        }
        System.out.println("sum is "+sum);
    }
}
