// Write a program to print whether a number is even or odd, also take input from the user.
package Day_1.Assignment;

import java.util.Scanner;

public class evenOrodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give a number to check whether it's a even or odd :-");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("It's a even number");
        } else {
            System.out.println("It's a odd number..");
        }
        input.close();
    }
}