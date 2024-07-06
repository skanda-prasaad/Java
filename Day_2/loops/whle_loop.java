package Day_2.loops;

import java.util.Scanner;

public class whle_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q :- Print numbers from 0 to 5
        int i = 0;
        while (i < 6) {
            System.out.println(i);
            i++;
        }
        input.close();
    }
}
