package chapter_twelve_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @Date:2020/8/16 18:03
 * @Authour:lenovo
 * @Description:
 */
public class TestListIterator {
    static int course;
    public static void main(String[] args) {
        System.out.println(course);
      List list = Arrays.asList(1,2,3,4);
      List list1 = new ArrayList(list);
      ListIterator listIterator =  list1.listIterator();
      while (listIterator.hasNext()){
          System.out.println(listIterator.next());
          System.out.println(listIterator.previousIndex());
      }
    }

}
