package loopAssignment;
//Q4- Write a program to print all Armstrong numbers between 1 to n. (Medium)
//        Explanation:
//        A three digit number is called the Armstrong number if the sum of the cube of its digit is equal to the number itself.
//        E.g.- 153 is an Armstrong number because (1^3)+(5^3)+(3^3) = 153.
//        Input1:
//        1000
//        Output1:
//        0
//        1
//        153
//        370
//        371
//        407
//        Input2:
//        500
//        Output2:
//        0
//        1
//        153
//        370
//        371
//        407
import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1; //variable that will check for each number starting from 1 till n
        while (num <= n) {
            int count = 0;
            int i = num;
            while (i > 0) {
                count++;
                i /= 10;
            }
            int val = num;
            int sum = 0;
            while (val > 0) { //break the number digit by digit until it reaches 0
                int digit = val % 10;
                sum += Math.pow(digit, count);//add cube of digit to sum
                val /= 10;
                if (sum > val) {
                    continue;
                }
            }
            if (sum == num) { //this is an armstrong number
                System.out.println(num);
            }
            num++;
        }
    }
}

