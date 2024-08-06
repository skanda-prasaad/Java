//  Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package Basics.Assignment;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---Simple intrest--");
        System.out.print("Principle :- ");
        int princ = input.nextInt();
        System.out.print("Time(years):- ");
        int time = input.nextInt();
        System.out.print("Rate(%) :- ");
        int rate = input.nextInt();
        int intrest = (princ * time * rate) / 100;
        System.out.println("The intrest is :- " + intrest);
        input.close();
    }
}
