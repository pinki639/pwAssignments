package AssignmentCondition;
//Q1 - Write a program which takes the values of length and breadth from user and check if it is
//        a square or not.
//input
//        Enter length:
//        5
//        Enter breadth:
//        4
//output
//        It is a rectangle
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        if(length==breadth){
            System.out.println("square");
        }
        else{
            System.out.println("rectangle");
        }
    }
}
