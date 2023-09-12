package assignment2;
import java.util.*;
//Q5 - Given few lines of input(number of lines unknown) where each line has two
//        strings, concatenate the strings.
//        Input :
//        Hello World
//        Happy Faces
//        Sunny Day
//        Good Morning
//        Output :
//        HelloWorld
//        HappyFaces
//        SunnyDay
//        GoodMorning
public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String a=sc.next();
            String b=sc.next();
            System.out.println(a+b);
        }
    }
}
