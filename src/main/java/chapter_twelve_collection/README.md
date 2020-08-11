##集合的创建出来的初衷

---
>数组本来也是可以满足的，但是数组的尺寸是固定的，而且集合中的元素之间的对应关系
是不具有多变性的。
---

##集合工具类中的api
###数组工具类 
>这里我们不可以使用 返回的集合做增删操作 因为返回的集合底层是数组长度是固定的
````java
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
        //数组的打印方式
        System.out.println(Arrays.toString(a));//[1, 3, 4, 5, 6]
    }
}
````
###COLLECTION工具类

````java

````
