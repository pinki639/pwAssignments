package methodAssignment;

;

//Q2 - Write a Java method to count all vowels in a string
//        Input1:
//        Output1:
//
//        Input2:
//        Output2:
//        (consists of all lowercase letters)
//        coding
//        2
//        (consists of all lowercase letters)
//        heaps
//        2
import java.sql.SQLOutput;
import java.util.*;
public class Question2 {
    public static int count_vov(String x) {
        int count=0;
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string");
        String x=sc.nextLine();
        System.out.println(count_vov(x));

    }
}
