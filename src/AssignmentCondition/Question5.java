package AssignmentCondition;
//Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication
//        and division.
//        input
//        Enter an operator (+, -, *, /): -
//        Enter two numbers:
//        6
//        8
//output
//        6 - 8 = -2
import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the operator from +,_,*,%,/");
        char op=sc.next().charAt(0);
        double result;
        System.out.println("enter number1 ");
        double num1=sc.nextDouble();
        System.out.println("enter number2 ");
        double num2=sc.nextDouble();
        switch (op){
            case '+':
               result=num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result=num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result=num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result=num1 / num2;
                System.out.println(result);
               break;
            case '%':
                result=num1 % num2;
                System.out.println(result);
                break;
        }

    }
}
