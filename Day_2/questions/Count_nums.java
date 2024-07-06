package Day_2.questions;

import java.util.Scanner;

public class Count_nums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers :- ");
        int num = input.nextInt();
        System.out.print("Enter the number to count :- ");
        int numc = input.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == numc) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("The number of times " + numc + " occured is " + count);
        input.close();
    }
}
