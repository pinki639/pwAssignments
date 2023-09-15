package methodAssignment;
//Q3 - Write a Java method to display the middle character of a string.(Easy)
//        Note: a) If the length of the string is even there will be two middle characters.
//        b) If the length of the string is odd there will be one middle character.
//        Input1:
//        Output1:
//
//        Input2:
//        Output2:
//        350
//        5
//
//        4004
//        00
import java.util.*;
public class Question3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scn.nextLine();
        System.out.print(middle(s));
    }
    public static String middle(String s){
        if(s.length() % 2 == 0){
            return s.substring(s.length()/2, s.length()/2 + 2);
        }else{
            return s.substring(s.length()/2, s.length()/2 + 1);
        }
    }
}

