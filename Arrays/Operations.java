package Arrays;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,5};
//        int[] nums = {1,2,3};
//        String[] fruits =  new String[]{"Hello", "World"};

        int[] arr = new int[100];
        Scanner input = new Scanner(System.in);
        int maths, phy;
        System.out.println("Enter maths marks: ");
        maths = input.nextInt();
        System.out.println("Enter physics marks: ");
        phy = input.nextInt();
        arr[0] = maths;
        arr[1] = phy;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
