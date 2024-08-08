package Function;

import java.util.Arrays;

public class Varlen_args {
    public static void main(String[] args) {
        fun(2,5,3,6,9,8,7,5,2);
    }
//suppose we dont know how many inputs we are taking we use ...(any datatypes)
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
