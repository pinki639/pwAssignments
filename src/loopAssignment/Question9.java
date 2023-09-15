package loopAssignment;
//Q9- Write a program to check whether a prime Number can be expressed as a Sum of Two
//        Prime Numbers.
//        Input1:
//        13
//        Output1:
//        True
//        Input2:
//        2
//        Output2:
//        False
import java.util.*;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n) && isPrime(n-2)){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
            return false;
        }
        return true;
    }
}
