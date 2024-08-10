package Arrays;

import java.util.Arrays;
// import java.lang.reflect.Array;
import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Array of primitives :.......
        // int[] arr = new int[5];
        // arr[0] = 5;
        // arr[1] = 25;
        // System.out.println(arr[1]);

        // input using for loop :-


        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = input.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));


        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // for(int num : arr){ // for every element in array, print the element.
        //     System.out.print(num);// num represents element of array.
        // }

        // Array of objects :.......
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
        input.close();
    }
}
