package chapter_twelve_collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Date:2020/8/16 17:19
 * @Authour:lenovo
 * @Description:
 */
public class TestForEachDeleteElement {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        List<Integer> list = Arrays.asList(a);
        List<Integer> list1 = new ArrayList<>(list);
        List<Integer> list2 = new ArrayList<>(list);
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            list1.remove(1);
        }
        System.out.println(list1);
        System.out.println(list2);
        //测试foreach,在foreach情况下是不可以做出移除操作的
/*        for (Integer l:
            list2 ) {
            list2.remove(l);
        }*/
      //获得迭代器
       Iterator iterator = list2.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
           iterator.remove();
       }

       //查看最后的list2集合
        System.out.println(list2);
    }

}
