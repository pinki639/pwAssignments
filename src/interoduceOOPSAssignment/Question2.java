package interoduceOOPSAssignment;
//Q2. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//        creating a class named 'Triangle' without any parameter in its constructor.
public class Question2 {
    public static class Triangle{
   int base,height,hypo;
    }

    public static void main(String[] args) {
        Triangle tri=new Triangle();
         tri.base=3;
        tri.height=4;
        tri.hypo=5;
        int area= tri.base* tri.height/2;
        int perimeter= tri.base+ tri.height+ tri.hypo;
        System.out.println("area = "+area+","+"perimeter="+perimeter);
    }
}
