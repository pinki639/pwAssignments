package assignment2;
import java.util.*;
//Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
//        100), write a program to calculate his total marks and percentage marks.
//        Input :
//        78
//        89
//        95
//        Output : Total marks: 262
//        Percentage marks: 87%

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        System.out.println("total marks:"+(x1+x2+x3));
        System.out.println("percentage marks :"+(x1+x2+x3)/3+"%");
    }
}
