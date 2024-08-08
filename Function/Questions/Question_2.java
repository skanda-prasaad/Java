// Define a program to find out whether a given number is even or odd.
package Function.Questions;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to know even or odd :- ");
        int num = input.nextInt();
        boolean ans = isEven(num);
        if(ans){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num+ " is odd");
        }
        input.close();
    }
    static boolean isEven(int a){
        if(a % 2 == 0){
            return true;
        }
        return false;
    }
}
