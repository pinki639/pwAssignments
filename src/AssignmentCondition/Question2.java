package AssignmentCondition;
//Q2 - Write a program to print absolute value of a number entered by the user.
//        Sample Input :-1
//        Sample Output :1
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x<0){
            x=x*-1;
            System.out.println("absolute value is "+x);
        }
    }
}
