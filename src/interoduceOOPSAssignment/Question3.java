package interoduceOOPSAssignment;
//Q3. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
//        of its length and breadth as parameters of its constructor and having a method named 'returnArea'
//        which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

import java.sql.SQLOutput;
import java.util.*;
//public class Question3 {
     class Area {
        int length;
        int breadth;

        public  Area(int l, int b) {
            length = l;
            breadth = b;
        }

        public int getArea() {
            return length * breadth;
        }
    }


public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Area area_of_rect=new Area(l,b);
        System.out.println("enter length and breadth");
        int l=sc.nextInt();
        int b=sc.nextInt();
        Area area_of_rect=new Area(l,b);

        System.out.println("area: "+ area_of_rect.getArea());
    }
}
