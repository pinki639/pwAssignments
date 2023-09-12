package javaOperators;
//Q2 - Swap two numbers without the use of third variable.
//        Input: 5 10
//        Output: 10 5
public class Question2 {
    public static void main(String[] args) {
        int x=5;
        int y=10;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x+" "+y);
    }
}
