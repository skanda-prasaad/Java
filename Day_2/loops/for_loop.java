// Q :- Print numbers from 0 to 5

package Day_2.loops;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q :- Print numbers from 0 to 5
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        // Q :- Print numbers from 0 to n

        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        input.close();
    }
}
