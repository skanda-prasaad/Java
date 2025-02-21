package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.set(2,100);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);

        list1.addAll(list2);
        System.out.println(list1);

        list2.clear();
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<Integer>(list1);
        System.out.println(list3);

    }
}
