package AssignmentCondition;
//Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
//        calculate Profit or Loss.
//        Explanation : Formula for profit and loss
//        Profit = S.P - C.P
//        Loss = C.P - S.P
//        (S.P is Selling Price and C.P is Cost Price)
//input
//        Enter cost price: 4000
//        Enter selling price: 9560
//output
//        Profit = 5560
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        int profit,loss;
        if(sp>cp){
          profit=sp-cp;
            System.out.println("profit is "+profit);
        }
        else{
            loss=cp-sp;
            System.out.println("loss is "+loss);
        }
    }
}
