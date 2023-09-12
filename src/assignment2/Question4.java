package assignment2;
import java.util.*;
//Q4 - Given two numbers, return their sum in the following format:
//        Int t representing number of test cases
//        T lines of Two integers representing the numbers to be added
//        Input :
//        3
//        4 5
//        18 20
//        49 27
//        Output :
//        9
//        38
//        76

public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            System.out.println(a1+a2);
        }
    }
}
