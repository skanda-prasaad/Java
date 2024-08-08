package Function;

import java.util.Arrays;

public class Change_Value {
    public static void main(String[] args) {
        // Create an array 
        int[] arr = {2,5,9,8,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
        nums[0] = 99;// if any changes is made to the object via ref variable,same objext will be changed.
}

}