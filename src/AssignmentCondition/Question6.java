package AssignmentCondition;
//Q6 - Write a program to calculate marks to grades . Follow the conversion rule as given below :
//
//        Sample Input :Enter Your Marks: 98
//        Sample Output :Your Grade is A+


import java.util.*;
public class Question6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks");
        int marks = sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("your grade is +A");
        }
        else if(marks >= 80 && marks < 90) {
            System.out.println("your grade is A");
        }
        else if(marks >= 70 && marks < 80) {
            System.out.println("your grade is +B");
        }
        else if(marks >= 60 && marks < 70) {
            System.out.println("your grade is B");
        }
        else if(marks >= 50 && marks < 60) {
            System.out.println("your grade is C");
        }
        else if(marks >=40 && marks < 50) {
            System.out.println("your grade is D");
        }
        else if(marks >= 30 && marks < 40) {
            System.out.println("your grade is E");
        }
        else {
            System.out.println("your grade is F");
        }

    }
}
