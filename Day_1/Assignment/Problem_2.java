//  Take name as input and print a greeting message for that particular name.

package Day_1.Assignment;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name :- ");
        String name = input.next();
        System.out.println("Hello " + name);
        input.close();
    }
}
