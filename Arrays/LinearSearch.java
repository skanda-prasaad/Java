package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[]{2,4,6,8,10,12};
        int key;
        System.out.print("Enter Key to search: ");
        key = input.nextInt();
        boolean found = false;
        for (int j : arr) {
            if (key == j) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Found");
        }else {
            System.out.println("Not found");
        }
    }
}
