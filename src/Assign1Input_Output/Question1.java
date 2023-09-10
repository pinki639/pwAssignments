package Assign1Input_Output;

//Q1 - Take 2 integer values in two variables x and y and print their product. (Easy)
//        Sample Input : x=2, y=4 (Both integers)
//        Sample Output : 8

import java .util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int x=sc.nextInt();
        System.out.println("enter the second number");
        int y=sc.nextInt();
        System.out.println("multiplication of two numbers are");
        System.out.println(x*y);
    }
}
