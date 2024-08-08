package Function;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // input of two numbers and print sum 
        int ans = sum3(5,20);
        System.out.println("The sum value is " + ans);
    }

    // Pass the value of numbers when u are calling method in main()
    static int sum3(int a, int b){
        int c = a + b;
        return c;
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

