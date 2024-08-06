package Day_2.questions;

import java.util.Scanner;

public class larger_num {
    public static void main(String[] args) {

    // Method 1---->
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // int max = a;
        // if (b > max) {
        //     max = b;
        // }
        // else if (c > max) {
        //     max = c;
        // }
        // System.out.println(max);
        // input.close();

        //method 2----->

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
        input.close();
    }
}
