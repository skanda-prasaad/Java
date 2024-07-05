// Take 2 numbers as input and print the largest number.

package Day_1.Assignment;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---Finding largest number---");
        System.out.print("Enter 1st number :- ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number :- ");
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is the largest number");
        } else {
            System.out.println(num2 + " is the largest number");
        }
        input.close();
    }
}