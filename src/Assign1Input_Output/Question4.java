package Assign1Input_Output;
//Q4 - Write a Java program to calculate the cube of a number. (Easy)
//        Sample Input : 4
//        Sample Output : 64
//        The sizeof(bool) : 1 bytes
import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int x=sc.nextInt();
        System.out.println("cube of the given number is "+x*x*x);

    }
}
