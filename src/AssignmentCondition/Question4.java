package AssignmentCondition;
//Q4 - Write a program to print positive number entered by the user, if user enters a negative
//        number, it is skipped
//input Enter ana integer: -6
//output the number is negative and skipped.
import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>=0){
            System.out.println("enter number is positive "+x);
        }
        else{
            System.out.println("enter number is negative and skipped");
        }
    }
}
