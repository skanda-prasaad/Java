package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_eg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // arraylist are used if there is no value specified for row.
        // Syntax :-
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(20);
        // list.add(25);
        // list.add(63);
        // list.set(1, 85); // set is used to change the value
        // list.remove(2);
        // System.out.println(list);

        // input :-
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        // get item at any index :-
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+ " "); // pass index here, list[index] will not work here.
        }

        input.close();
    }
}
