// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package Function.Questions;

import java.util.Scanner;

/**
 * Question_1
 */
public class Question_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers to know max and min value");
        System.out.print("Num1:- ");
        int num1 = input.nextInt();
        System.out.print("Num1:- ");
        int num2 = input.nextInt();
        System.out.print("Num1:- ");
        int num3 = input.nextInt();
        int largest = maximum(num1,num2,num3);
        int smallest = minimum(num1,num2,num3);
        System.out.println("The max number among three is " + largest);
        System.out.println("The min number among three is " + smallest);
        input.close();
    }

    static int maximum(int a,int b,int c){
        return Math.max(c,(Math.max(a,b)));
    }
    static int minimum(int a,int b,int c){
        return Math.min(c,(Math.min(a, b)));
    }
}
