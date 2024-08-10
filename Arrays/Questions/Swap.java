package Arrays.Questions;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,8,9,6,3};
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
