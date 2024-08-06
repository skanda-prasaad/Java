package Function;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // input of two numbers and print sum 
        int ans = add2();
        System.out.println("The sum value is " + ans);
    }

    // return type -->
    static int add2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = input.nextInt(); 
        int num2 = input.nextInt();
        int sum = num1 + num2;
        input.close();
        return sum;
        // input.close();
    }

    // void method -->
    static void add(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = input.nextInt(); 
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        input.close();
    }
      /*
       * return_type name()
       * {
       *   body
       *   return statement; 
       * }
       */

}

