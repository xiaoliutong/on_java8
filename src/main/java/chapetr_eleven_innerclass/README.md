##内部类

###创建一个内部类
```java
package chapetr_eleven_innerclass;

import java.io.Serializable;

public class FirstInnerClass {
    private String test="";
    private class InnerClass implements Serializable {
        private void getParam(){
            System.out.println(test);
        }
    }
}
```
如上面的内部类,它具有外部类全部元素的访问权限。


###关于内部类向上转型的问题。

```java
package chapetr_eleven_innerclass;

public class SecondInnerClass {
    private class PrivateClass extends FirstInnerClass {

    }

    protected class ProtectClass extends FirstInnerClass {

    }

    public PrivateClass getPrivateClass() {
        return new PrivateClass();
    }

    public ProtectClass getProtectClass() {
        return new ProtectClass();
    }
}

class Test2 {
    public static void main(String[] args) {
        SecondInnerClass secondInnerClass = new SecondInnerClass();
        FirstInnerClass firstInnerClass = secondInnerClass.getPrivateClass();
        FirstInnerClass firstInnerClass1 = secondInnerClass.getProtectClass();
    }
}
```
注意点：这里需要注意下普通类的权限修饰符只可以为 public 和 默认修饰符（包权限修饰）内部类权限修饰更加多样化


###局部内部类
````java

````


###匿名内部类

````java


````

