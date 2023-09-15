package methodAssignment;
//Q4 - Write a Java method to check whether a year (integer) entered by the user is a leap year
//        or not.
//Input1:
//        Output1:
//
//        Input2:
//        Output2:
//        2017
//        False
//
//        2022
//        False
import java.util.*;
public class Question4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the year");
        int year = scn.nextInt();
        System.out.print(is_LeapYear(year));
    }
    public static boolean is_LeapYear(int y){
        boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));
        return a && (b || c);
    }
}
