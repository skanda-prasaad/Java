// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package Day_1.Assignment;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---Simple Calculator--");
        System.out.print("Enter first number :- ");
        int num1 = input.nextInt();
        System.out.print("Enter second number :- ");
        int num2 = input.nextInt();
        System.out.print("Enter the operator (+,-,/,*) :- ");
        char operator = input.next().charAt(0);
        double result;
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Addition value is :- " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Subtraction value is :- " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Multiplication value is :- " + result);
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Division by zero error");
            } else {
                result = num1 / num2;
                System.out.println("Division value is :- " + result);
            }
        }
        input.close();
    }
}
