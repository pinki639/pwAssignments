package Assign1Input_Output;
//Q3 - Write a Java program to take the length and breadth of a rectangle and print its area. (Easy)
//        Sample Input : 7, 4
//        Sample Output : 28

import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int x=sc.nextInt();
        System.out.println("enter breadth");
        int y= sc.nextInt();
        System.out.println("area og rectangle is:"+x*y);
    }
}
