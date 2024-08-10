package Arrays;

import java.util.Scanner;

public class Multidim_arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int[][] arr = new int[3][];

        int[][] arr = {
            {5,8,9}, //0th index
            {9,4,7},// 1st index
            {9,2,3}// 2nd index
        };

    // input in array :-
    for (int row = 0; row < arr.length; row++) {
        // for each col in every row :-
        for (int col = 0; col < arr[row].length; col++) {
            arr[row][col] = input.nextInt();
        }
    }
    input.close();
    }
}
