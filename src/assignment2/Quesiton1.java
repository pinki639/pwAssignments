package assignment2;
//Q1 - Input name, roll number and field of interest from user and print in the format below :
//        Name: xyz, Roll number: xyz, Field of interest: xyz
//        Input : Single line format
//        Aman Gupta 4053 Physics
//Output :
//        Name: Aman Gupta
//        Roll Number: 4053
//        Field of interest: Physics

import java.util.*;

public class Quesiton1 {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String first_name=sc.next();
      String last_name=sc.next();
      int rollNo=sc.nextInt();
      String Area_of_Interest=sc.next();
        System.out.println("name"+first_name+" "+last_name);
        System.out.println("roll number "+rollNo);
        System.out.println("area of interest "+Area_of_Interest);
    }
}
