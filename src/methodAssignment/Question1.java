package methodAssignment;
//Q1 - Write a Java method to compute the average of three numbers
//Input1:
//
//        Output1:
//
//        Input2:
//
//        Output2:
//        25
//        45
//        65
//        45
//
//        25
//        25
//        25
//        25
public class Question1 {
    public static double average(int a,int b,int c){
//        int a=2;
//        int b=3;
//        int c=4;
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(average(2,3,4));
    }
}
