package loopAssignment;
//Q5 – Write a program to print the cross pattern given below (in the shape of X): (Medium)
//        *   *
//         * *
//          *
//         * *
//        *   *
public class Question5 {
    public static void main(String[] args) {
        int size=5;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if((i==j)||(i+j==size-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
