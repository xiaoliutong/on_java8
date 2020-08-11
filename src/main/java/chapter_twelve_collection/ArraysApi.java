package chapter_twelve_collection;

import java.util.Arrays;
import java.util.List;

public class ArraysApi {
    public static void main(String[] args) {
        List list = Arrays.asList(1, 2, 4, "55");
        System.out.println(list);//[1, 2, 4, 55]
        List list1 = Arrays.asList(new int[22], "44", 55);
        System.out.println(list1);//[[I@5caf905d, 44, 55]
        //泛型约束
        List list2 = Arrays.<Integer>asList(11);
        list2.set(0,2);
       // list2.remove(0);
       // list2.add(22);
        int[] a = {1,3,4,5,6};
        //数组的打印方式
        System.out.println(Arrays.toString(a));//[1, 3, 4, 5, 6]
    }
}
