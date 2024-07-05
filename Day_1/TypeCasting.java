package Day_1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // int num = input.nextInt();

        // Type CASTING ----->
        // compressing the bigger number into smaller explicitly..
        int num = (int) (89.52f);
        System.out.println(num);

        // automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte) (a);
        // System.out.println(b);

        // 257 % 256 = 1

        int c = 60;
        byte d = (byte) (c);
        System.out.println(d);

        int number = 'a';
        System.out.println(number);

        input.close();
    }
}
