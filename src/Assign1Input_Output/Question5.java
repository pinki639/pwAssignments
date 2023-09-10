package Assign1Input_Output;
//Q5 - Write a Java program to swap two numbers with the help of a third variable.
//        Sample Input : 2,3
//        Sample Output : 3,2

public class Question5 {
    public static void main(String[] args) {
        int x=2;
        int temp;
        int y=3;
        temp=x;
        x=y;
        y=temp;
        System.out.println(x+","+y);
    }
}
