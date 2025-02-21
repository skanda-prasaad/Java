package Arrays.Questions;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] num = new int[]{2,4,6,8,10};
        int first = 0, last = num.length-1;
        while(first < last){
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;

            first++;
            last--;
        }
        System.out.println(Arrays.toString(num));
    }
}
