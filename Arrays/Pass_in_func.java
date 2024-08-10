package Arrays;

import java.util.Arrays;

public class Pass_in_func {
    public static void main(String[] args) {
        int[] nums = {3,5,8,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 25;
    }
}
