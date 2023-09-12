package assignment2;
import java.util.*;

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
